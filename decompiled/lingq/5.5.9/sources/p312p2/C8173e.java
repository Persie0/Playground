package p312p2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p286o2.C7904d;
import p286o2.C7906f;
import p326q.C8450f;
import p326q.C8452h;
import p338qd.C8584v;
import p404u2.C9383c;
import p404u2.C9386f;
import p404u2.C9388h;
import p404u2.C9390j;
import p404u2.C9391k;
import p404u2.CallableC9387g;
import p404u2.CallableC9389i;
import p404u2.RunnableC9381a;
import p404u2.RunnableC9382b;
import p404u2.RunnableC9395o;
import p446w2.InterfaceC9803a;

/* JADX INFO: renamed from: p2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8173e {

    /* JADX INFO: renamed from: a */
    public static final C8181m f44309a;

    /* JADX INFO: renamed from: b */
    public static final C8450f<String, Typeface> f44310b;

    /* JADX INFO: renamed from: p2.e$a */
    public static class a extends C8584v {

        /* JADX INFO: renamed from: I */
        public final C7906f.e f44311I;

        public a(C7906f.e eVar) {
            this.f44311I = eVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f44309a = new C8179k();
        } else if (i10 >= 28) {
            f44309a = new C8176h();
        } else {
            f44309a = new C8175g();
        }
        f44310b = new C8450f<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX INFO: renamed from: a */
    public static Typeface m16230a(Context context, C7904d.b bVar, Resources resources, int i10, String str, int i11, int i12, C7906f.e eVar, boolean z10) {
        Typeface typefaceMo16234a;
        Typeface typefaceCreate;
        if (bVar instanceof C7904d.e) {
            C7904d.e eVar2 = (C7904d.e) bVar;
            String str2 = eVar2.f43053d;
            typefaceMo16234a = null;
            boolean z11 = false;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (eVar != null) {
                    eVar.m15681b(typefaceCreate);
                }
                return typefaceCreate;
            }
            if (!z10 ? eVar == null : eVar2.f43052c == 0) {
                z11 = true;
            }
            int i13 = z10 ? eVar2.f43051b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a aVar = new a(eVar);
            C9386f c9386f = eVar2.f43050a;
            C9383c c9383c = new C9383c(aVar, handler);
            if (z11) {
                C8450f<String, Typeface> c8450f = C9391k.f48194a;
                String str3 = c9386f.f48183e + "-" + i12;
                Typeface typefaceM16516b = C9391k.f48194a.m16516b(str3);
                if (typefaceM16516b != null) {
                    handler.post(new RunnableC9381a(aVar, typefaceM16516b));
                    typefaceMo16234a = typefaceM16516b;
                } else if (i13 == -1) {
                    C9391k.a aVarM17755a = C9391k.m17755a(str3, context, c9386f, i12);
                    c9383c.m17752a(aVarM17755a);
                    typefaceMo16234a = aVarM17755a.f48198a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C9391k.a aVar2 = (C9391k.a) C9391k.f48195b.submit(new CallableC9387g(str3, context, c9386f, i12)).get(i13, TimeUnit.MILLISECONDS);
                                    c9383c.m17752a(aVar2);
                                    typefaceMo16234a = aVar2.f48198a;
                                } catch (ExecutionException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e11) {
                            throw e11;
                        }
                    } catch (InterruptedException unused2) {
                        c9383c.f48176b.post(new RunnableC9382b(c9383c.f48175a, -3));
                    }
                }
            } else {
                C8450f<String, Typeface> c8450f2 = C9391k.f48194a;
                String str4 = c9386f.f48183e + "-" + i12;
                Typeface typefaceM16516b2 = C9391k.f48194a.m16516b(str4);
                if (typefaceM16516b2 != null) {
                    handler.post(new RunnableC9381a(aVar, typefaceM16516b2));
                    typefaceMo16234a = typefaceM16516b2;
                } else {
                    C9388h c9388h = new C9388h(c9383c);
                    synchronized (C9391k.f48196c) {
                        C8452h<String, ArrayList<InterfaceC9803a<C9391k.a>>> c8452h = C9391k.f48197d;
                        ArrayList<InterfaceC9803a<C9391k.a>> orDefault = c8452h.getOrDefault(str4, null);
                        if (orDefault != null) {
                            orDefault.add(c9388h);
                        } else {
                            ArrayList<InterfaceC9803a<C9391k.a>> arrayList = new ArrayList<>();
                            arrayList.add(c9388h);
                            c8452h.put(str4, arrayList);
                            C9391k.f48195b.execute(new RunnableC9395o(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new CallableC9389i(str4, context, c9386f, i12), new C9390j(str4)));
                        }
                    }
                }
            }
        } else {
            typefaceMo16234a = f44309a.mo16234a(context, (C7904d.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceMo16234a != null) {
                    eVar.m15681b(typefaceMo16234a);
                } else {
                    eVar.m15680a(-3);
                }
            }
        }
        if (typefaceMo16234a != null) {
            f44310b.m16517c(m16231b(resources, i10, str, i11, i12), typefaceMo16234a);
        }
        return typefaceMo16234a;
    }

    /* JADX INFO: renamed from: b */
    public static String m16231b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
