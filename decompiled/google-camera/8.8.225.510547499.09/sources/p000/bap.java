package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bap implements bao, bat {

    /* JADX INFO: renamed from: a */
    public final ban f2878a;

    /* JADX INFO: renamed from: b */
    public final Object f2879b;

    /* JADX INFO: renamed from: c */
    private final bau[] f2880c;

    public bap(bbo bboVar, ban banVar) {
        bau[] bauVarArr = {new bar((bbh) bboVar.f2907a), new bas((bbc) bboVar.f2908b), new baz((bbh) bboVar.f2910d), new bav((bbh) bboVar.f2909c), new bay((bbh) bboVar.f2909c), new bax((bbh) bboVar.f2909c), new baw((bbh) bboVar.f2909c)};
        this.f2878a = banVar;
        this.f2880c = bauVarArr;
        this.f2879b = new Object();
    }

    @Override // p000.bao
    /* JADX INFO: renamed from: a */
    public final void mo2166a(Iterable iterable) {
        iterable.getClass();
        synchronized (this.f2879b) {
            bau[] bauVarArr = this.f2880c;
            for (int i = 0; i < 7; i++) {
                bauVarArr[i].m2171d(null);
            }
            bau[] bauVarArr2 = this.f2880c;
            for (int i2 = 0; i2 < 7; i2++) {
                bau bauVar = bauVarArr2[i2];
                bauVar.f2883b.clear();
                bauVar.f2884c.clear();
                List list = bauVar.f2883b;
                for (Object obj : iterable) {
                    if (bauVar.mo2169b((bcv) obj)) {
                        list.add(obj);
                    }
                }
                List list2 = bauVar.f2883b;
                List list3 = bauVar.f2884c;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    list3.add(((bcv) it.next()).f2964a);
                }
                if (bauVar.f2883b.isEmpty()) {
                    bauVar.f2882a.m2178f(bauVar);
                } else {
                    bbh bbhVar = bauVar.f2882a;
                    synchronized (bbhVar.f2897b) {
                        if (bbhVar.f2898c.add(bauVar)) {
                            if (bbhVar.f2898c.size() == 1) {
                                bbhVar.f2899d = bbhVar.mo2174b();
                                ayc.m2099a();
                                int i3 = bbi.f2901a;
                                StringBuilder sb = new StringBuilder();
                                sb.append(bbhVar.getClass().getSimpleName());
                                sb.append(": initial state = ");
                                sb.append(bbhVar.f2899d);
                                bbhVar.mo2176d();
                            }
                            bauVar.mo2165a(bbhVar.f2899d);
                        }
                    }
                }
                bauVar.m2172e(bauVar.f2886e, bauVar.f2885d);
            }
            bau[] bauVarArr3 = this.f2880c;
            for (int i4 = 0; i4 < 7; i4++) {
                bauVarArr3[i4].m2171d(this);
            }
        }
    }

    @Override // p000.bao
    /* JADX INFO: renamed from: b */
    public final void mo2167b() {
        synchronized (this.f2879b) {
            bau[] bauVarArr = this.f2880c;
            for (int i = 0; i < 7; i++) {
                bau bauVar = bauVarArr[i];
                if (!bauVar.f2883b.isEmpty()) {
                    bauVar.f2883b.clear();
                    bauVar.f2882a.m2178f(bauVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2168c(String str) {
        bau bauVar;
        boolean z;
        synchronized (this.f2879b) {
            bau[] bauVarArr = this.f2880c;
            int i = 0;
            while (true) {
                if (i >= 7) {
                    bauVar = null;
                    break;
                }
                bauVar = bauVarArr[i];
                Object obj = bauVar.f2885d;
                if (obj != null && bauVar.mo2170c(obj) && bauVar.f2884c.contains(str)) {
                    break;
                }
                i++;
            }
            if (bauVar != null) {
                ayc.m2099a();
                int i2 = baq.f2881a;
                bauVar.getClass().getSimpleName();
            }
            z = bauVar == null;
        }
        return z;
    }
}
