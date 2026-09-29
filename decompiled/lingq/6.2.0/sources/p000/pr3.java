package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface pr3 {
    boolean allowUnsafeNonAsciiValues() default false;

    String[] value();
}
