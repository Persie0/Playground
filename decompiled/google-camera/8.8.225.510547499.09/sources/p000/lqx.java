package p000;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqx implements msi {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f39022a = 0;

    /* JADX INFO: renamed from: b */
    private static volatile lqc f39023b = new lqc(lqw.f39019a);

    /* JADX INFO: renamed from: c */
    private final String f39024c;

    /* JADX INFO: renamed from: d */
    private final String f39025d;

    /* JADX INFO: renamed from: e */
    private final Object f39026e;

    /* JADX INFO: renamed from: f */
    private final lqj f39027f;

    /* JADX INFO: renamed from: g */
    private volatile int f39028g = -1;

    /* JADX INFO: renamed from: h */
    private volatile Object f39029h;

    /* JADX INFO: renamed from: i */
    private volatile lhz f39030i;

    public lqx(String str, String str2, Object obj, lqj lqjVar) {
        obj.getClass();
        this.f39024c = str;
        this.f39025d = str2;
        this.f39026e = obj;
        this.f39027f = lqjVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a4 A[Catch: all -> 0x0113, TryCatch #2 {, blocks: (B:10:0x0016, B:12:0x001a, B:13:0x002b, B:15:0x0035, B:18:0x004e, B:27:0x0060, B:29:0x0062, B:31:0x0069, B:41:0x0096, B:43:0x00a4, B:44:0x00a9, B:46:0x00c7, B:47:0x00c9, B:61:0x00ea, B:67:0x0101, B:72:0x010b, B:73:0x010d, B:66:0x00f6, B:57:0x00e2, B:58:0x00e3, B:34:0x007b, B:39:0x0088, B:74:0x010f, B:75:0x0111, B:48:0x00ca, B:50:0x00ce, B:52:0x00da, B:53:0x00de, B:19:0x004f, B:21:0x0053, B:22:0x0059, B:23:0x005b), top: B:82:0x0016, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7 A[Catch: all -> 0x0113, TryCatch #2 {, blocks: (B:10:0x0016, B:12:0x001a, B:13:0x002b, B:15:0x0035, B:18:0x004e, B:27:0x0060, B:29:0x0062, B:31:0x0069, B:41:0x0096, B:43:0x00a4, B:44:0x00a9, B:46:0x00c7, B:47:0x00c9, B:61:0x00ea, B:67:0x0101, B:72:0x010b, B:73:0x010d, B:66:0x00f6, B:57:0x00e2, B:58:0x00e3, B:34:0x007b, B:39:0x0088, B:74:0x010f, B:75:0x0111, B:48:0x00ca, B:50:0x00ce, B:52:0x00da, B:53:0x00de, B:19:0x004f, B:21:0x0053, B:22:0x0059, B:23:0x005b), top: B:82:0x0016, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce A[Catch: all -> 0x00e0, TryCatch #0 {, blocks: (B:48:0x00ca, B:50:0x00ce, B:52:0x00da, B:53:0x00de), top: B:80:0x00ca, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3 A[Catch: all -> 0x0113, TRY_LEAVE, TryCatch #2 {, blocks: (B:10:0x0016, B:12:0x001a, B:13:0x002b, B:15:0x0035, B:18:0x004e, B:27:0x0060, B:29:0x0062, B:31:0x0069, B:41:0x0096, B:43:0x00a4, B:44:0x00a9, B:46:0x00c7, B:47:0x00c9, B:61:0x00ea, B:67:0x0101, B:72:0x010b, B:73:0x010d, B:66:0x00f6, B:57:0x00e2, B:58:0x00e3, B:34:0x007b, B:39:0x0088, B:74:0x010f, B:75:0x0111, B:48:0x00ca, B:50:0x00ce, B:52:0x00da, B:53:0x00de, B:19:0x004f, B:21:0x0053, B:22:0x0059, B:23:0x005b), top: B:82:0x0016, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b A[Catch: all -> 0x0113, TryCatch #2 {, blocks: (B:10:0x0016, B:12:0x001a, B:13:0x002b, B:15:0x0035, B:18:0x004e, B:27:0x0060, B:29:0x0062, B:31:0x0069, B:41:0x0096, B:43:0x00a4, B:44:0x00a9, B:46:0x00c7, B:47:0x00c9, B:61:0x00ea, B:67:0x0101, B:72:0x010b, B:73:0x010d, B:66:0x00f6, B:57:0x00e2, B:58:0x00e3, B:34:0x007b, B:39:0x0088, B:74:0x010f, B:75:0x0111, B:48:0x00ca, B:50:0x00ce, B:52:0x00da, B:53:0x00de, B:19:0x004f, B:21:0x0053, B:22:0x0059, B:23:0x005b), top: B:82:0x0016, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Map] */
    /* JADX INFO: renamed from: c */
    private final Object m15896c(lpj lpjVar) {
        Object objMo15898a;
        Object objMo15898a2;
        String strM15822b;
        lqv lqvVar;
        Map map;
        Object obj;
        Map map2;
        ?? r6;
        String strM15481d;
        mrm mrmVar;
        int i = this.f39028g;
        Object obj2 = this.f39029h;
        if (this.f39030i == null || i < this.f39030i.m15364e() || obj2 == null) {
            synchronized (this) {
                if (this.f39030i == null) {
                    lqj lqjVar = this.f39027f;
                    String str = this.f39024c;
                    lpj.m15825c();
                    this.f39030i = ((lqh) lqjVar).m15852a(lpjVar, str).f38977h;
                }
                if (this.f39028g < this.f39030i.m15364e()) {
                    this.f39028g = this.f39030i.m15364e();
                    lqj lqjVar2 = this.f39027f;
                    String str2 = this.f39024c;
                    String str3 = this.f39025d;
                    lpj.m15825c();
                    Context context = lpjVar.f38894c;
                    mrm mrmVar2 = lqh.f38959a;
                    if (mrmVar2 == null) {
                        synchronized (lqh.class) {
                            if (lqh.f38959a == null) {
                                lqh.f38959a = lpf.m15820a(context);
                            }
                            mrmVar = lqh.f38959a;
                        }
                        mrmVar2 = mrmVar;
                        objMo15898a = null;
                        if (!mrmVar2.mo16813g() && (strM15481d = ((liv) mrmVar2.mo16809c()).m15481d(lph.m15821a(str2), null, str3)) != null) {
                            try {
                                objMo15898a2 = ((lqh) lqjVar2).f38961c.mo15898a(strM15481d);
                            } catch (IOException | IllegalArgumentException e) {
                                Log.e("PhenotypeCombinedFlags", "Invalid Phenotype flag value for flag ".concat(str3), e);
                                objMo15898a2 = null;
                            }
                        }
                        strM15822b = lph.m15822b(lpjVar.f38894c, str2);
                        if (((lqh) lqjVar2).f38960b) {
                            lku.m15616K(true, "DirectBoot aware package %s can not access account-scoped flags.", strM15822b);
                        }
                        lqi.m15856a(lpjVar.m15826b().submit(new lll(lpjVar, strM15822b, 5)));
                        lqvVar = ((lqh) lqjVar2).m15852a(lpjVar, strM15822b).f38973d;
                        map = lqvVar.f39017b;
                        if (map == null) {
                            synchronized (lqvVar.f39016a) {
                                map2 = lqvVar.f39017b;
                                r6 = map2;
                                if (map2 == null) {
                                    ?? Mo6051a = lqvVar.f39018c.mo6051a();
                                    lqvVar.f39017b = Mo6051a;
                                    lqvVar.f39018c = null;
                                    r6 = Mo6051a;
                                }
                                obj = r6.get(str3);
                            }
                        } else {
                            obj = map.get(str3);
                        }
                        if (obj != null) {
                            try {
                                objMo15898a = ((lqh) lqjVar2).f38962d.mo15898a(obj);
                            } catch (IOException | ClassCastException e2) {
                                Log.e("PhenotypeCombinedFlags", "Invalid Phenotype flag value for flag ".concat(str3), e2);
                            }
                        }
                        if (true == mrmVar2.mo16813g()) {
                            objMo15898a2 = objMo15898a;
                        }
                        if (objMo15898a2 == null) {
                            objMo15898a2 = this.f39026e;
                        }
                        this.f39029h = objMo15898a2;
                    } else {
                        objMo15898a = null;
                        objMo15898a2 = !mrmVar2.mo16813g() ? null : null;
                        strM15822b = lph.m15822b(lpjVar.f38894c, str2);
                        if (((lqh) lqjVar2).f38960b) {
                            lku.m15616K(true, "DirectBoot aware package %s can not access account-scoped flags.", strM15822b);
                        }
                        lqi.m15856a(lpjVar.m15826b().submit(new lll(lpjVar, strM15822b, 5)));
                        lqvVar = ((lqh) lqjVar2).m15852a(lpjVar, strM15822b).f38973d;
                        map = lqvVar.f39017b;
                        if (map == null) {
                            synchronized (lqvVar.f39016a) {
                                map2 = lqvVar.f39017b;
                                r6 = map2;
                                if (map2 == null) {
                                    ?? Mo6051a2 = lqvVar.f39018c.mo6051a();
                                    lqvVar.f39017b = Mo6051a2;
                                    lqvVar.f39018c = null;
                                    r6 = Mo6051a2;
                                }
                                obj = r6.get(str3);
                            }
                        } else {
                            obj = map.get(str3);
                        }
                        if (obj != null) {
                            objMo15898a = ((lqh) lqjVar2).f38962d.mo15898a(obj);
                        }
                        if (true == mrmVar2.mo16813g()) {
                            objMo15898a2 = objMo15898a;
                        }
                        if (objMo15898a2 == null) {
                            objMo15898a2 = this.f39026e;
                        }
                        this.f39029h = objMo15898a2;
                    }
                }
                obj2 = this.f39029h;
            }
        }
        return obj2;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        Object obj = lpj.f38889a;
        lpl.f38900b = true;
        if (lpl.f38901c == null) {
            lpl.f38901c = new lpk();
        }
        Context context = lpj.f38890b;
        if (context != null) {
            return m15896c(lpj.m15824a(context));
        }
        lpl.m15830a();
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    /* JADX INFO: renamed from: b */
    public final Object m15897b(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return m15896c(lpj.m15824a(applicationContext));
    }
}
