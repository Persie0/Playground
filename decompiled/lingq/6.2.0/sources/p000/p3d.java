package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p3d extends vkb {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f55538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3d(String str, int i) {
        super(str);
        this.f55538c = i;
    }

    @Override // p000.vkb
    /* JADX INFO: renamed from: a */
    public final kmb mo12757a(C3329mb c3329mb, List list) {
        int i = this.f55538c;
        cnb cnbVar = kmb.f47523y;
        switch (i) {
            case 0:
                return cnbVar;
            case 1:
            case 2:
                return this;
            case 3:
                return new bkb(Double.valueOf(0.0d));
            default:
                return cnbVar;
        }
    }
}
