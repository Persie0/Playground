package p000;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.ArraySet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
import p021j$.util.Collection$EL;
import p021j$.util.Comparator$CC;
import p021j$.util.concurrent.ConcurrentHashMap;
import p021j$.util.stream.Collectors;
import p021j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hha implements hgy {

    /* JADX INFO: renamed from: a */
    public static final nbh f27782a = nbh.m17259h("com/google/android/apps/camera/socialshare/setting/SocialShareSettingsImpl");

    /* JADX INFO: renamed from: b */
    public static final Pattern f27783b = Pattern.compile("^([A-Za-z][A-Za-z\\d_]*(\\.|\\$))+[A-Za-z][A-Za-z\\d_]*$");

    /* JADX INFO: renamed from: c */
    public final had f27784c;

    /* JADX INFO: renamed from: d */
    public mwx f27785d;

    /* JADX INFO: renamed from: e */
    private final hah f27786e;

    /* JADX INFO: renamed from: f */
    private final ihk f27787f;

    public hha(ihk ihkVar, had hadVar, hah hahVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27787f = ihkVar;
        this.f27784c = hadVar;
        this.f27786e = hahVar;
    }

    /* JADX INFO: renamed from: k */
    public static mxk m10282k(String str, mxk mxkVar) {
        if (!str.isEmpty()) {
            List listM16851f = msa.m16846b(',').m16851f(str);
            if (listM16851f.size() >= 2) {
                return mxk.m17134F(listM16851f);
            }
        }
        return mxkVar;
    }

    /* JADX INFO: renamed from: m */
    private static Map m10283m(mxk mxkVar) {
        msa msaVarM16846b = msa.m16846b('/');
        HashMap map = new HashMap();
        naz nazVarListIterator = mxkVar.listIterator();
        while (nazVarListIterator.hasNext()) {
            ArrayList arrayList = new ArrayList(msaVarM16846b.m16851f((String) nazVarListIterator.next()));
            Collection$EL.removeIf(arrayList, fjv.f22321o);
            if (arrayList.size() >= 2 && Collection$EL.stream(arrayList).allMatch(fjv.f22322p)) {
                ArraySet arraySet = new ArraySet();
                int size = arrayList.size();
                String str = "";
                for (int i = 0; i < size; i++) {
                    String str2 = (String) arrayList.get(i);
                    if (str.isEmpty()) {
                        str = str2;
                    } else {
                        arraySet.add(str2);
                    }
                }
                map.put(str, arraySet);
            }
        }
        return map;
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: a */
    public final mwx mo10264a() {
        return this.f27785d;
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: b */
    public final Comparator mo10265b() {
        return Comparator$CC.comparingInt(new ToIntFunction() { // from class: hgz
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                hha hhaVar = this.f27770a;
                String str = ((ResolveInfo) obj).activityInfo.packageName;
                mwt mwtVarM17115i = mwx.m17115i();
                mxk mxkVarM10282k = hha.m10282k(ohy.f46048a.mo6051a().mo18515c(), hgu.f27752f);
                mxk mxkVarM10282k2 = hha.m10282k(ohy.f46048a.mo6051a().mo18513a(), mzx.f41874a);
                int i = 0;
                if (!mxkVarM10282k2.isEmpty() && !hhaVar.m10284l()) {
                    ArrayList arrayList = new ArrayList(mxkVarM10282k);
                    arrayList.removeAll(mxkVarM10282k2);
                    arrayList.addAll(0, mxkVarM10282k2);
                    mxkVarM10282k = mxk.m17134F(arrayList);
                }
                naz nazVarListIterator = mxkVarM10282k.listIterator();
                while (nazVarListIterator.hasNext()) {
                    String str2 = (String) nazVarListIterator.next();
                    if (hha.f27783b.matcher(str2).matches()) {
                        mwtVarM17115i.mo17110e(str2, Integer.valueOf(i));
                        i++;
                    }
                }
                Integer num = (Integer) mwtVarM17115i.mo17059b().get(str);
                if (num == null) {
                    num = Integer.MAX_VALUE;
                }
                return num.intValue();
            }
        });
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ List mo10266c(String str) {
        return (ArrayList) Collection$EL.stream(mo10267d(str)).filter(new gek(this, str, 11)).filter(new gek(new ConcurrentHashMap(), hgq.f27719m, 10)).collect(Collectors.toCollection(drv.f12453g));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.hgy
    /* JADX INFO: renamed from: d */
    public final List mo10267d(String str) {
        ihk ihkVar = this.f27787f;
        List<ResolveInfo> listQueryIntentActivities = (List) ihkVar.f30967b.get(str);
        if (listQueryIntentActivities == null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            listQueryIntentActivities = ((PackageManager) ihkVar.f30966a).queryIntentActivities(intent, 0);
            ihkVar.f30967b.put(str, listQueryIntentActivities);
        }
        listQueryIntentActivities.size();
        return listQueryIntentActivities;
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: e */
    public final void mo10268e(List list) {
        Stream map = Collection$EL.stream(this.f27785d.keySet()).filter(new gfw((List) Collection$EL.stream(list).map(hgq.f27715i).collect(Collectors.toList()), 10)).map(hgq.f27716j);
        had hadVar = this.f27784c;
        hadVar.getClass();
        map.filter(new gfw(hadVar, 11)).forEach(new gyc(this, 7));
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: f */
    public final void mo10269f() {
        mwt mwtVarM17115i = mwx.m17115i();
        mxk mxkVarM10282k = m10282k(ohy.f46048a.mo6051a().mo18514b(), hgu.f27750d);
        mxk mxkVarM10282k2 = m10282k(ohy.f46048a.mo6051a().mo18516d(), hgu.f27751e);
        Map mapM10283m = m10283m(mxkVarM10282k);
        Map mapM10283m2 = m10283m(mxkVarM10282k2);
        for (Map.Entry entry : mapM10283m.entrySet()) {
            String str = (String) entry.getKey();
            mxk mxkVarM17134F = mxk.m17134F((Collection) entry.getValue());
            mxk mxkVarM17134F2 = mzx.f41874a;
            if (mapM10283m2.containsKey(str)) {
                Set set = (Set) mapM10283m2.get(str);
                set.getClass();
                mxkVarM17134F2 = mxk.m17134F(set);
                mapM10283m2.remove(str);
            }
            npa npaVarM10254c = hgt.m10254c();
            npaVarM10254c.m17583f(str);
            npaVarM10254c.m17584g(mxkVarM17134F);
            npaVarM10254c.m17585h(mxkVarM17134F2);
            mwtVarM17115i.mo17110e(str, npaVarM10254c.m17582e());
        }
        for (Map.Entry entry2 : mapM10283m2.entrySet()) {
            entry2.getKey();
            String str2 = (String) entry2.getKey();
            npa npaVarM10254c2 = hgt.m10254c();
            npaVarM10254c2.m17583f((String) entry2.getKey());
            npaVarM10254c2.m17584g(mzx.f41874a);
            npaVarM10254c2.m17585h(mxk.m17134F((Collection) entry2.getValue()));
            mwtVarM17115i.mo17110e(str2, npaVarM10254c2.m17582e());
        }
        this.f27785d = mwtVarM17115i.mo17059b();
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: g */
    public final void mo10270g(List list) {
        int i = mws.f41739d;
        mo10268e(mzr.f41857a);
        Collection$EL.stream(list).sorted(mo10265b()).limit(3L).map(hgq.f27714h).forEach(new gyc(this, 6));
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: h */
    public final void mo10271h(List list) {
        if (!((Boolean) this.f27786e.mo10031c(gzy.f27004P)).booleanValue() || m10284l()) {
            return;
        }
        mo10270g(list);
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: i */
    public final boolean mo10272i(String str) {
        Stream map = Collection$EL.stream(mo10267d(str)).map(hgq.f27718l);
        mwx mwxVar = this.f27785d;
        mwxVar.getClass();
        return map.anyMatch(new gfw(mwxVar, 13));
    }

    @Override // p000.hgy
    /* JADX INFO: renamed from: j */
    public final boolean mo10273j(String str) {
        Set set = (Set) Collection$EL.stream(this.f27785d.keySet()).filter(fjv.f22323q).collect(Collectors.toSet());
        Stream map = Collection$EL.stream(mo10267d(str)).map(hgq.f27717k);
        set.getClass();
        return map.anyMatch(new gfw(set, 12));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m10284l() {
        return ((Boolean) this.f27786e.mo10031c(gzy.f27008T)).booleanValue() || ((Boolean) this.f27786e.mo10031c(gzy.f27009U)).booleanValue();
    }
}
