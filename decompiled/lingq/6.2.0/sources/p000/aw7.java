package p000;

import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.ReaderFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aw7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7618a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f7619b;

    public /* synthetic */ aw7(ReaderFragment readerFragment, int i) {
        this.f7618a = i;
        this.f7619b = readerFragment;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f7618a;
        xfa xfaVar = xfa.f68157a;
        ReaderFragment readerFragment = this.f7619b;
        switch (i) {
            case 0:
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                return readerFragment;
            case 1:
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                C2412n c2412nM9290W0 = readerFragment.m9290W0();
                c2412nM9290W0.getClass();
                c2412nM9290W0.f29360g.mo9326g2(xx4.f68925a);
                return xfaVar;
            default:
                bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                readerFragment.m9290W0().m9343w3(0);
                return xfaVar;
        }
    }
}
