package p000;

import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.ReaderFragment;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class pw7 implements zab {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ obb f56909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f56910b;

    public pw7(obb obbVar, ReaderFragment readerFragment) {
        this.f56909a = obbVar;
        this.f56910b = readerFragment;
    }

    @Override // p000.zab
    /* JADX INFO: renamed from: a */
    public final void mo13541a(vab vabVar) {
        Object value;
        wbb wbbVar;
        Object value2;
        vabVar.getClass();
        kbb kbbVar = (kbb) this.f56909a;
        bbb bbbVar = (bbb) vabVar;
        bbbVar.m3596g((float) kbbVar.f46988a);
        bbbVar.m3592c(bbbVar.f8302a, "playVideo", new Object[0]);
        bh4[] bh4VarArr = ReaderFragment.f28218P0;
        C2412n c2412nM9290W0 = this.f56910b.m9290W0();
        double d = kbbVar.f46988a;
        double d2 = kbbVar.f46989b;
        C3244l c3244l = c2412nM9290W0.f29343b2;
        if (c3244l.getValue() == null) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, new wbb(d, d2, 0L, 4)));
        } else {
            do {
                value = c3244l.getValue();
                wbbVar = (wbb) value;
            } while (!c3244l.m15570h(value, wbbVar != null ? wbb.m23839a(wbbVar, d, d2, 0L, 4) : null));
        }
    }
}
