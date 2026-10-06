package p000;

import android.util.Printer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kgz implements Printer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f36001a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f36002b;

    public /* synthetic */ kgz(Printer printer, int i) {
        this.f36002b = i;
        this.f36001a = printer;
    }

    public /* synthetic */ kgz(kbo kboVar, int i) {
        this.f36002b = i;
        this.f36001a = kboVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.util.Printer, java.lang.Object] */
    @Override // android.util.Printer
    public final void println(String str) {
        switch (this.f36002b) {
            case 0:
                this.f36001a.mo13944f(str);
                break;
            default:
                this.f36001a.println("  ".concat(String.valueOf(str)));
                break;
        }
    }
}
