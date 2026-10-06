package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface omh {
    /* JADX INFO: renamed from: a */
    int m18655a() default 1;

    /* JADX INFO: renamed from: b */
    String m18656b() default "";

    /* JADX INFO: renamed from: c */
    String m18657c() default "";

    /* JADX INFO: renamed from: d */
    String m18658d() default "";

    /* JADX INFO: renamed from: e */
    int[] m18659e() default {};
}
