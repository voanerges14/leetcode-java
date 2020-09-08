import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public final class User {

        class Role {
            private String roleName;
        }

        private final int id;
        private final String name;
        private final List<Role> roles;

        public User(int id, String name, Role role, List<Role> roles) {
            this.id = id;
            this.name = name;
            this.roles = Collections.unmodifiableList(roles);
        }

        //No setters!

        public int getId() { return id; }

        public String getName() { return name; }

        public List<Role> getRoles() { return Collections.unmodifiableList(roles);}
    }

    private List<User> users;
    private Map<String, List<User>> result;
//
//    public void filterUsers() {
////        users.stream().filter().forEach();
////        for (User user: users) {
////            result.merge(user.name, Lists.newArrayList(user), (v1, v2) -> {
////                var list = Lists.newArrayList();
////                list.addAll(v1);
////                list.addAll(v2);
////                return list;
////            });
//        }
//    }
    public static void main(String[] args) {
        Stream<String> users = Stream.of("Pavlo", "Oksana", "Oleg", "Ivan", "Kit", "Vasyl");

//        users.filter(s->s.length()==4).forEach(System.out::println); // Oleg
//        users.filter(s->s.length()==5).forEach(System.out::println); // Pavlo
//        users.filter(s->s.length()==6).forEach(System.out::println);

    Object
    }
}
