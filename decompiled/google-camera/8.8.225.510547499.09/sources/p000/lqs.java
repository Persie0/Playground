package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientMode;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lqs implements nom {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f39004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39006c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f39007d;

    public /* synthetic */ lqs(AmbientMode.AmbientController ambientController, nom nomVar, Executor executor, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f39007d = i;
        this.f39006c = ambientController;
        this.f39004a = nomVar;
        this.f39005b = executor;
    }

    public /* synthetic */ lqs(civ civVar, String str, oju ojuVar, int i) {
        this.f39007d = i;
        this.f39006c = civVar;
        this.f39004a = str;
        this.f39005b = ojuVar;
    }

    public /* synthetic */ lqs(lqm lqmVar, String str, lpj lpjVar, int i) {
        this.f39007d = i;
        this.f39004a = lqmVar;
        this.f39005b = str;
        this.f39006c = lpjVar;
    }

    public /* synthetic */ lqs(ltn ltnVar, nps npsVar, nps npsVar2, int i) {
        this.f39007d = i;
        this.f39006c = ltnVar;
        this.f39004a = npsVar;
        this.f39005b = npsVar2;
    }

    public /* synthetic */ lqs(ltp ltpVar, nom nomVar, Executor executor, int i) {
        this.f39007d = i;
        this.f39006c = ltpVar;
        this.f39004a = nomVar;
        this.f39005b = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, nom] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, nom] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Future, nps] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final nps mo3942a(Object obj) {
        String string;
        switch (this.f39007d) {
            case 0:
                Object obj2 = this.f39004a;
                Object obj3 = this.f39005b;
                Object obj4 = this.f39006c;
                List<String> listM17097l = (List) obj;
                lqm lqmVar = (lqm) obj2;
                if (!lqmVar.f38983d) {
                    listM17097l = mws.m17097l("");
                }
                mwn mwnVarM17090e = mws.m17090e();
                for (String str : listM17097l) {
                    if (!lqu.f39015c.containsKey(mrn.m16830a(obj3, str))) {
                        lpj lpjVar = (lpj) obj4;
                        lrd lrdVar = new lrd(lpjVar, (String) obj3, str, lqmVar.f38981b);
                        if (lqmVar.f38982c) {
                            Context context = lpjVar.f38894c;
                            string = lqr.m15895a(context).getString(lqmVar.f38980a, "");
                        } else {
                            string = str;
                        }
                        nps npsVarM15910b = lrdVar.m15910b(string);
                        mwnVarM17090e.m17082g(nod.m17554j(nod.m17554j(npm.m17611q(npsVarM15910b), new cnc(lrdVar, 13), lpjVar.m15826b()), new lqt(lpjVar, npsVarM15910b, lqmVar, str, 0), lpjVar.m15826b()));
                    }
                }
                return kxk.m14958D(mwnVarM17090e.m17081f()).m17605a(ljc.f38363c, ((lpj) obj4).m15826b());
            case 1:
                Object obj5 = this.f39006c;
                Object obj6 = this.f39004a;
                ?? r2 = this.f39005b;
                if (!((Boolean) obj).booleanValue()) {
                    return kxk.m14965K(false);
                }
                civ civVar = (civ) obj5;
                civVar.f5901b.mo13961e((String) obj6);
                civVar.f5901b.mo13961e(YmzeHXaMYOLk.YyrvxGo);
                ciw ciwVar = (ciw) r2.get();
                civVar.f5901b.mo13963g("start");
                nps npsVarMo3538bd = ciwVar.mo3538bd();
                civVar.f5901b.mo13962f();
                civVar.f5901b.mo13962f();
                return npsVarMo3538bd;
            case 2:
                Object obj7 = this.f39006c;
                ?? r0 = this.f39004a;
                ?? r1 = this.f39005b;
                if (kxk.m14973S(r0).equals(kxk.m14973S(r1))) {
                    return npp.f44031a;
                }
                ltn ltnVar = (ltn) obj7;
                nps npsVarM17554j = nod.m17554j(r1, mov.m16716b(new cqc(ltnVar, (nps) r1, 6)), ltnVar.f39180c);
                synchronized (ltnVar.f39182e) {
                    break;
                }
                return npsVarM17554j;
            case 3:
                Object obj8 = this.f39006c;
                return ((ltp) obj8).f39190b.mo15976d(this.f39004a, this.f39005b);
            default:
                Object obj9 = this.f39006c;
                return ((ltp) ((AmbientMode.AmbientController) obj9).f1697a).f39190b.mo15976d(this.f39004a, this.f39005b);
        }
    }
}
