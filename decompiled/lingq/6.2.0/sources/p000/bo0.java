package p000;

import com.lingq.core.network.api.result.ResultTokenMeaning;
import com.lingq.feature.reader.old.C2411m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bo0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8759c;

    public /* synthetic */ bo0(int i, Object obj, Object obj2) {
        this.f8757a = i;
        this.f8758b = obj;
        this.f8759c = obj2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f8757a;
        int i2 = -1;
        Object obj3 = this.f8759c;
        Object obj4 = this.f8758b;
        int i3 = 0;
        switch (i) {
            case 0:
                Map map = (Map) obj3;
                return ((C3166k) obj4).compare((Integer) map.get(Integer.valueOf(((ResultTokenMeaning) obj).f21587a)), (Integer) map.get(Integer.valueOf(((ResultTokenMeaning) obj2).f21587a)));
            case 1:
                Locale locale = ((C2411m) obj3).f29253u;
                w65 w65Var = (w65) obj;
                Set set = (Set) obj4;
                Iterator it = set.iterator();
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (i4 < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        String strMo8037d = w65Var.mo8037d();
                        locale.getClass();
                        if (!fa4.m11650l((String) next, vz1.m23610P(strMo8037d, locale))) {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                    }
                }
                Integer numValueOf = Integer.valueOf(i4);
                w65 w65Var2 = (w65) obj2;
                for (Object obj5 : set) {
                    if (i3 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    String strMo8037d2 = w65Var2.mo8037d();
                    locale.getClass();
                    if (fa4.m11650l((String) obj5, vz1.m23610P(strMo8037d2, locale))) {
                        i2 = i3;
                        return ss5.m21718o(numValueOf, Integer.valueOf(i2));
                    }
                    i3++;
                }
                return ss5.m21718o(numValueOf, Integer.valueOf(i2));
            default:
                kmb kmbVar = (kmb) obj;
                kmb kmbVar2 = (kmb) obj2;
                if (kmbVar instanceof cnb) {
                    return !(kmbVar2 instanceof cnb) ? 1 : 0;
                }
                if (kmbVar2 instanceof cnb) {
                    return -1;
                }
                vkb vkbVar = (vkb) obj4;
                return vkbVar == null ? kmbVar.mo3809c().compareTo(kmbVar2.mo3809c()) : (int) qdd.m19882i(vkbVar.mo12757a((C3329mb) obj3, Arrays.asList(kmbVar, kmbVar2)).mo3811e().doubleValue());
        }
    }
}
