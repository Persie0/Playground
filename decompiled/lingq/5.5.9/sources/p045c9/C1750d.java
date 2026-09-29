package p045c9;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.firebase.messaging.C3257t;
import com.lingq.p055ui.home.vocabulary.VocabularyFragment;
import ga.C5726i;
import java.util.Map;
import p090e9.InterfaceC5385a;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5745a;
import p174i9.InterfaceC6208b;
import p452w8.AbstractC9838s;
import p479xa.C10144m;
import ph.C8389z;

/* JADX INFO: renamed from: c9.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1750d implements InterfaceC5385a.a, C10144m.a, InterfaceC5745a, SwipeRefreshLayout.InterfaceC1198f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9622c;

    public /* synthetic */ C1750d(Object obj, int i10, Object obj2) {
        this.f9620a = i10;
        this.f9621b = obj;
        this.f9622c = obj2;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1198f
    /* JADX INFO: renamed from: c */
    public final void mo4616c() {
        VocabularyFragment.m10019n0((VocabularyFragment) this.f9621b, (C8389z) this.f9622c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p090e9.InterfaceC5385a.a
    /* JADX INFO: renamed from: g */
    public final Object mo4925g() {
        int i10 = this.f9620a;
        Object obj = this.f9622c;
        Object obj2 = this.f9621b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return ((C1753g) obj2).f9632c.mo10855L0((AbstractC9838s) obj);
            default:
                C1753g c1753g = (C1753g) obj2;
                c1753g.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    c1753g.f9638i.mo10854l(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g abstractC5751g) {
        C3257t c3257t = (C3257t) this.f9621b;
        String str = (String) this.f9622c;
        synchronized (c3257t) {
            c3257t.f16436b.remove(str);
        }
        return abstractC5751g;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f9620a;
        Object obj2 = this.f9622c;
        Object obj3 = this.f9621b;
        switch (i10) {
            case 2:
                ((InterfaceC6208b) obj).mo12811y((InterfaceC6208b.a) obj3, (Metadata) obj2);
                break;
            case 3:
                ((InterfaceC6208b) obj).mo12806t((InterfaceC6208b.a) obj3, (String) obj2);
                break;
            case 4:
                ((InterfaceC6208b) obj).mo12803q((InterfaceC6208b.a) obj3, (C2367a) obj2);
                break;
            case 5:
                ((InterfaceC6208b) obj).mo12800n((InterfaceC6208b.a) obj3, (C5726i) obj2);
                break;
            default:
                ((InterfaceC6208b) obj).getClass();
                break;
        }
    }
}
