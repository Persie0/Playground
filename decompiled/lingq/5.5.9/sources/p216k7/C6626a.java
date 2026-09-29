package p216k7;

import p148h7.InterfaceC5898a;
import p193j7.C6421a;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6626a {

    /* JADX INFO: renamed from: f */
    public static final C6626a f37566f = new C6626a();

    /* JADX INFO: renamed from: a */
    public int f37567a;

    /* JADX INFO: renamed from: b */
    public int f37568b;

    /* JADX INFO: renamed from: c */
    public String f37569c;

    /* JADX INFO: renamed from: d */
    public C6421a f37570d;

    /* JADX INFO: renamed from: e */
    public InterfaceC5898a f37571e;

    /* JADX INFO: renamed from: a */
    public final InterfaceC5898a m13255a() {
        if (this.f37571e == null) {
            synchronized (C6626a.class) {
                if (this.f37571e == null) {
                    this.f37571e = new C8573r0();
                }
            }
        }
        return this.f37571e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C6421a m13256b() {
        if (this.f37570d == null) {
            synchronized (C6626a.class) {
                if (this.f37570d == null) {
                    this.f37570d = new C6421a();
                }
            }
        }
        this.f37570d.getClass();
        return new C6421a();
    }
}
