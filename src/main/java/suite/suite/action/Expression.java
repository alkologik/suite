package suite.suite.action;

import suite.suite.Subject;
import suite.suite.Suite;

import java.util.function.Supplier;

@FunctionalInterface
public interface Expression extends Action {

    static Expression fromSupplier(Supplier<?> supplier) {
        return () -> Suite.set(supplier.get());
    }

    Subject play();

    default Subject play(Subject in) {
        return play();
    }

    default Subject gamble() throws Exception {
        return play();
    }

    default Subject gamble(Subject in) throws Exception {
        return play();
    }
}
