package me;

import p339qe.C8597b;

/* JADX INFO: renamed from: me.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7545c {

    /* JADX INFO: renamed from: c */
    public static final a f41624c = new a();

    /* JADX INFO: renamed from: a */
    public final C8597b f41625a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7543a f41626b;

    /* JADX INFO: renamed from: me.c$a */
    public static final class a implements InterfaceC7543a {
        @Override // me.InterfaceC7543a
        /* JADX INFO: renamed from: a */
        public final void mo15049a() {
        }

        @Override // me.InterfaceC7543a
        /* JADX INFO: renamed from: b */
        public final String mo15050b() {
            return null;
        }

        @Override // me.InterfaceC7543a
        /* JADX INFO: renamed from: c */
        public final void mo15051c(String str, long j10) {
        }
    }

    public C7545c(C8597b c8597b) {
        this.f41625a = c8597b;
        this.f41626b = f41624c;
    }

    public C7545c(C8597b c8597b, String str) {
        this(c8597b);
        m15054a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m15054a(String str) {
        this.f41626b.mo15049a();
        this.f41626b = f41624c;
        if (str == null) {
            return;
        }
        this.f41626b = new C7549g(this.f41625a.m16819b(str, "userlog"));
    }
}
