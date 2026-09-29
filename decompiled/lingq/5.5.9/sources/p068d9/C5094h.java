package p068d9;

import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: d9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5094h implements InterfaceC10306b<AbstractC5091e> {

    /* JADX INFO: renamed from: d9.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C5094h f33034a = new C5094h();
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        C5087a c5087a = AbstractC5091e.f33031a;
        if (c5087a != null) {
            return c5087a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
