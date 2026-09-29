package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.crypto.tink.shaded.protobuf.C1143r;

/* JADX INFO: loaded from: classes.dex */
public final class tyb extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f63101e = 2;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f63102f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context f63103g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f63104h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyb(C3600t6 c3600t6, Activity activity, ptb ptbVar) {
        super((v3c) c3600t6.f61897b, true);
        this.f63103g = activity;
        this.f63102f = ptbVar;
        this.f63104h = c3600t6;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        Boolean boolValueOf;
        Bundle bundle = null;
        eub eubVarAsInterface = null;
        switch (this.f63101e) {
            case 0:
                try {
                    Context context = this.f63103g;
                    lda.m16130p(context);
                    String strM6659e = C1143r.m6659e(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strM6659e)) {
                        strM6659e = C1143r.m6659e(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strM6659e);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    v3c v3cVar = (v3c) this.f63104h;
                    Object[] objArr = boolValueOf == null || !boolValueOf.booleanValue();
                    v3cVar.getClass();
                    try {
                        eubVarAsInterface = aub.asInterface(ao2.m2949c(context, objArr != false ? ao2.f7274d : ao2.f7273c, ModuleDescriptor.MODULE_ID).m2955b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule$LoadingException e) {
                        v3cVar.m23088d(e, true, false);
                    }
                    v3cVar.f64811f = eubVarAsInterface;
                    if (v3cVar.f64811f != null) {
                        int iM2948a = ao2.m2948a(context, ModuleDescriptor.MODULE_ID);
                        int iM2950d = ao2.m2950d(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iM2948a, iM2950d);
                        boolean z = Boolean.TRUE.equals(boolValueOf) || iM2950d < iM2948a;
                        long j = iMax;
                        v3cVar.f64812g = j;
                        zzdb zzdbVar = new zzdb(161000L, j, z, (Bundle) this.f63102f, C1143r.m6659e(context));
                        Object[] objArr2 = v3cVar.f64812g >= 169;
                        eub eubVar = v3cVar.f64811f;
                        if (objArr2 != true) {
                            lda.m16130p(eubVar);
                            eubVar.initialize(new lp6(context), zzdbVar, this.f58538a);
                        } else {
                            lda.m16130p(eubVar);
                            eubVar.initializeWithElapsedTime(new lp6(context), zzdbVar, this.f58538a, this.f58539b);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((v3c) this.f63104h).m23088d(e2, true, false);
                    return;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) this.f63102f;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                eub eubVar2 = ((v3c) ((C3600t6) this.f63104h).f61897b).f64811f;
                lda.m16130p(eubVar2);
                eubVar2.onActivityCreatedByScionActivityInfo(zzdd.m5439r((Activity) this.f63103g), bundle, this.f58539b);
                break;
            default:
                eub eubVar3 = ((v3c) ((C3600t6) this.f63104h).f61897b).f64811f;
                lda.m16130p(eubVar3);
                eubVar3.onActivitySaveInstanceStateByScionActivityInfo(zzdd.m5439r((Activity) this.f63103g), (ptb) this.f63102f, this.f58539b);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyb(C3600t6 c3600t6, Bundle bundle, Activity activity) {
        super((v3c) c3600t6.f61897b, true);
        this.f63102f = bundle;
        this.f63103g = activity;
        this.f63104h = c3600t6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyb(v3c v3cVar, Context context, Bundle bundle) {
        super(v3cVar, true);
        this.f63103g = context;
        this.f63102f = bundle;
        this.f63104h = v3cVar;
    }
}
