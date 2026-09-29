package p000;

import com.lingq.core.player.tts.C1819c;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class tca implements ba7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1819c f62156a;

    public tca(C1819c c1819c) {
        this.f62156a = c1819c;
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: i */
    public final void mo3514i(int i) {
        Object value;
        Object value2;
        Object value3;
        C1819c c1819c = this.f62156a;
        C3211a c3211a = c1819c.f22176n;
        C3244l c3244l = c1819c.f22174l;
        if (i == 3 && c1819c.f22172j.m14722s()) {
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, ada.m287a((ada) value3, true)));
            return;
        }
        if (i == 3) {
            c3211a.mo4677k(0L);
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, ada.m287a((ada) value2, false)));
        } else {
            if (i == 2 || i != 4) {
                return;
            }
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, ada.m287a((ada) value, false)));
            c3211a.mo4677k(0L);
        }
    }
}
