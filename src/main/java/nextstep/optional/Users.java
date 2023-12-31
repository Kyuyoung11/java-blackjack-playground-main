package nextstep.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Users {
    static final User DEFAULT_USER = new User("codesquad", 100);

    List<User> users = Arrays.asList(
            new User("crong", 35),
            new User("pobi", 30),
            new User("jk", 40),
            new User("honux", 45),
            null
            );

    User getUser(String name) {
        return this.users.stream()
                .filter(Objects::nonNull)
                .filter(user->user.matchName(name))
                .findAny()
                .orElse(DEFAULT_USER);
//        for (User user : users) {
//            if (user.matchName(name)) {
//                return user;
//            }
//        }
//        return DEFAULT_USER;
    }
}
