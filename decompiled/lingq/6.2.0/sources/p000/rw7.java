package p000;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.ReaderFragment;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class rw7 extends AbstractC2949e2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59971b;

    public /* synthetic */ rw7(Object obj, int i) {
        this.f59970a = i;
        this.f59971b = obj;
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: a */
    public void mo8497a(vab vabVar, float f) {
        Object value;
        switch (this.f59970a) {
            case 1:
                vabVar.getClass();
                ReaderFragment readerFragment = (ReaderFragment) this.f59971b;
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                C2412n c2412nM9290W0 = readerFragment.m9290W0();
                wbb wbbVar = (wbb) c2412nM9290W0.f29343b2.getValue();
                if (wbbVar != null) {
                    double d = wbbVar.f66606b;
                    if (f >= d && ((Boolean) c2412nM9290W0.f29347c2.getValue()).booleanValue()) {
                        c2412nM9290W0.m9342v3(false);
                        C3244l c3244l = c2412nM9290W0.f29343b2;
                        do {
                            value = c3244l.getValue();
                        } while (!c3244l.m15570h(value, null));
                        c2412nM9290W0.f29398q0.mo4677k(nbb.f52579a);
                        c2412nM9290W0.f29286J.mo8493n(wbbVar.f66605a, Double.valueOf(d), c2412nM9290W0.m9332l3(), 1.0f, Long.valueOf(wbbVar.f66607c));
                        break;
                    }
                }
                break;
            default:
                super.mo8497a(vabVar, f);
                break;
        }
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: d */
    public void mo8499d(vab vabVar) {
        switch (this.f59970a) {
            case 0:
                vabVar.getClass();
                String str = ((Lesson) this.f59971b).f19162u;
                if (str != null && !vk9.m23391n0(AbstractC3352my.m17131l0(str))) {
                    ((bbb) vabVar).m3591b(AbstractC3352my.m17131l0(str), 0.0f);
                    break;
                }
                break;
            default:
                super.mo8499d(vabVar);
                break;
        }
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: e */
    public void mo8500e(vab vabVar, PlayerConstants$PlayerState playerConstants$PlayerState) {
        switch (this.f59970a) {
            case 1:
                vabVar.getClass();
                playerConstants$PlayerState.getClass();
                if (playerConstants$PlayerState == PlayerConstants$PlayerState.PAUSED) {
                    ReaderFragment readerFragment = (ReaderFragment) this.f59971b;
                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                    readerFragment.m9290W0().m9342v3(false);
                }
                break;
            default:
                super.mo8500e(vabVar, playerConstants$PlayerState);
                break;
        }
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: f */
    public void mo8501f(vab vabVar, float f) {
        Object value;
        wbb wbbVar;
        Object value2;
        switch (this.f59970a) {
            case 1:
                vabVar.getClass();
                ReaderFragment readerFragment = (ReaderFragment) this.f59971b;
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                long j = (long) (f * 1000.0f);
                C3244l c3244l = readerFragment.m9290W0().f29343b2;
                if (c3244l.getValue() == null) {
                    do {
                        value2 = c3244l.getValue();
                    } while (!c3244l.m15570h(value2, new wbb(0.0d, 0.0d, j, 3)));
                } else {
                    do {
                        value = c3244l.getValue();
                        wbbVar = (wbb) value;
                    } while (!c3244l.m15570h(value, wbbVar != null ? wbb.m23839a(wbbVar, 0.0d, 0.0d, j, 3) : null));
                }
                break;
            default:
                super.mo8501f(vabVar, f);
                break;
        }
    }
}
