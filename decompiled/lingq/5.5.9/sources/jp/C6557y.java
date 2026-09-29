package jp;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: jp.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C6557y implements InterfaceC6556x {

    /* JADX INFO: renamed from: a */
    public static final C6557y f37351a = new C6557y();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC6556x.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof InterfaceC6556x;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + InterfaceC6556x.class.getName() + "()";
    }
}
