package blackjackbefore.enums;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum YnEnum {
    YES("y",true),
    NO("n",false);

    private final String yn;
    private final boolean booleanValue;

    YnEnum(String yn, boolean booleanValue) {
        this.yn = yn;
        this.booleanValue = booleanValue;
    }

    public String getYn() {
        return yn;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }

    private static final Map<String, YnEnum> KEY_MAP =
            Stream.of(values()).collect(Collectors.toMap(YnEnum::getYn, Function.identity()));

    public static YnEnum valueOfYn(String yn) {
        return KEY_MAP.get(yn);
    }


}
