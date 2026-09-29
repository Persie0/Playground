package p000;

import java.util.List;

/* JADX INFO: renamed from: wl */
/* JADX INFO: loaded from: classes2.dex */
public final class C3726wl extends q80 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f66987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3726wl(int i, List list) {
        super(list, 0);
        this.f66987c = i;
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: a */
    public final m90 mo550a() {
        switch (this.f66987c) {
            case 0:
                return new ha1(0, (List) this.f57375b);
            case 1:
                return new bp3(0, (List) this.f57375b);
            case 2:
                return new ha1(1, (List) this.f57375b);
            case 3:
                return new bp3(1, (List) this.f57375b);
            case 4:
                return new bp3(2, (List) this.f57375b);
            case 5:
                return new b49((List) this.f57375b);
            default:
                return new ha1(2, (List) this.f57375b);
        }
    }
}
