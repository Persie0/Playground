package p000;

import android.util.Log;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwq implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34962a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34963b;

    public jwq(ilu iluVar, int i) {
        this.f34963b = i;
        this.f34962a = iluVar;
    }

    public jwq(jwf jwfVar, int i) {
        this.f34963b = i;
        this.f34962a = jwfVar;
    }

    public jwq(jxj jxjVar, int i) {
        this.f34963b = i;
        this.f34962a = jxjVar;
    }

    public jwq(jzo jzoVar, int i) {
        this.f34963b = i;
        this.f34962a = jzoVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f34963b) {
            case 0:
                return;
            case 1:
                throw new IllegalStateException();
            case 2:
                Iterator it = Collections.unmodifiableCollection(((jxj) this.f34962a).f35022c).iterator();
                while (it.hasNext()) {
                    ((jxe) it.next()).mo10569a(new IllegalStateException("Fail to start", th));
                }
                return;
            case 3:
                Iterator it2 = Collections.unmodifiableCollection(((jxj) this.f34962a).f35022c).iterator();
                while (it2.hasNext()) {
                    ((jxe) it2.next()).mo10569a(new IllegalStateException("Fail to stop", th));
                }
                return;
            default:
                Log.w("Failed to get MediaLimit. Stick with the default.", th);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ilu, java.lang.Object] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        switch (this.f34963b) {
            case 0:
                ((jwf) this.f34962a).mo3415bf((jwn) obj);
                break;
            case 1:
                this.f34962a.mo3420a(mrm.m16829i((Boolean) obj));
                break;
            case 2:
                Iterator it = Collections.unmodifiableCollection(((jxj) this.f34962a).f35022c).iterator();
                while (it.hasNext()) {
                    ((jxe) it.next()).mo10572d();
                }
                break;
            case 3:
                Iterator it2 = Collections.unmodifiableCollection(((jxj) this.f34962a).f35022c).iterator();
                while (it2.hasNext()) {
                    ((jxe) it2.next()).mo10573e();
                }
                break;
            default:
                ((jzo) this.f34962a).m13844q((jyo) obj);
                break;
        }
    }
}
