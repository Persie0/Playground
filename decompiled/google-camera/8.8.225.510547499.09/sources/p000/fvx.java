package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvx implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f23722a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f23723b;

    /* JADX INFO: renamed from: c */
    private final Object f23724c;

    public fvx(SwipeDismissBehavior swipeDismissBehavior, View view, int i) {
        this.f23723b = i;
        this.f23722a = swipeDismissBehavior;
        this.f23724c = view;
    }

    public fvx(fvy fvyVar, fvw fvwVar, int i) {
        this.f23723b = i;
        this.f23722a = fvyVar;
        this.f23724c = fvwVar;
    }

    public fvx(C0259ic c0259ic, C0258ib c0258ib, int i) {
        this.f23723b = i;
        this.f23722a = c0259ic;
        this.f23724c = c0258ib;
    }

    public fvx(jfa jfaVar, kym kymVar, int i, byte[] bArr) {
        this.f23723b = i;
        this.f23722a = jfaVar;
        this.f23724c = kymVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [fvw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
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
    @Override // java.lang.Runnable
    public final void run() {
        kbz kbzVar;
        InterfaceC0223gu interfaceC0223gu;
        try {
            switch (this.f23723b) {
                case 0:
                    try {
                        ((fvy) this.f23722a).f23725a.mo13961e("Command#" + String.valueOf(this.f23724c));
                        this.f23724c.mo8841a();
                        kbzVar = ((fvy) this.f23722a).f23725a;
                    } catch (InterruptedException e) {
                        kbzVar = ((fvy) this.f23722a).f23725a;
                        kbzVar.mo13962f();
                        return;
                    } catch (kec e2) {
                        kbzVar = ((fvy) this.f23722a).f23725a;
                        kbzVar.mo13962f();
                        return;
                    } catch (Exception e3) {
                        ((fvy) this.f23722a).f23726b.execute(new fnx(e3, 18));
                        kbzVar = ((fvy) this.f23722a).f23725a;
                    }
                    kbzVar.mo13962f();
                    return;
                case 1:
                    C0225gw c0225gw = ((C0259ic) this.f23722a).f25573c;
                    if (c0225gw != null && (interfaceC0223gu = c0225gw.f26548b) != null) {
                        interfaceC0223gu.mo8237D(c0225gw);
                    }
                    View view = (View) ((C0259ic) this.f23722a).f25576f;
                    if (view != null && view.getWindowToken() != null && ((C0237hh) this.f23724c).m10281h()) {
                        ((C0259ic) this.f23722a).f30284i = (C0258ib) this.f23724c;
                    }
                    ((C0259ic) this.f23722a).f30286k = null;
                    return;
                case 2:
                    if (((jfa) this.f23722a).f33858a) {
                        jcu jcuVar = (jcu) ((kym) this.f23724c).f37734b;
                        if (jcuVar.m12894a()) {
                            Object obj = this.f23722a;
                            jft jftVar = ((jfa) obj).f7622f;
                            Activity activityM4659l = ((LifecycleCallback) obj).m4659l();
                            PendingIntent pendingIntent = jcuVar.f33756d;
                            jib.m13205j(pendingIntent);
                            jftVar.startActivityForResult(GoogleApiActivity.m4642a(activityM4659l, pendingIntent, ((kym) this.f23724c).f37733a, false), 1);
                            return;
                        }
                        Object obj2 = this.f23722a;
                        if (((jfa) obj2).f33861d.m12903g(((LifecycleCallback) obj2).m4659l(), jcuVar.f33755c, null) != null) {
                            Object obj3 = this.f23722a;
                            jcy jcyVar = ((jfa) obj3).f33861d;
                            Activity activityM4659l2 = ((LifecycleCallback) obj3).m4659l();
                            ?? r3 = this.f23722a;
                            jft jftVar2 = ((jfa) r3).f7622f;
                            int i = jcuVar.f33755c;
                            Dialog dialogM12898b = jcyVar.m12898b(activityM4659l2, i, new jhe(jcyVar.m12903g(activityM4659l2, i, "d"), jftVar2), r3);
                            if (dialogM12898b != null) {
                                jcyVar.m12897a(activityM4659l2, dialogM12898b, "GooglePlayServicesErrorDialog", r3);
                                return;
                            }
                            return;
                        }
                        if (jcuVar.f33755c != 18) {
                            ((jfa) this.f23722a).m13010a(jcuVar, ((kym) this.f23724c).f37733a);
                            return;
                        }
                        Object obj4 = this.f23722a;
                        jcy jcyVar2 = ((jfa) obj4).f33861d;
                        Activity activityM4659l3 = ((LifecycleCallback) obj4).m4659l();
                        ?? r6 = this.f23722a;
                        ProgressBar progressBar = new ProgressBar(activityM4659l3, null, R.attr.progressBarStyleLarge);
                        progressBar.setIndeterminate(true);
                        progressBar.setVisibility(0);
                        AlertDialog.Builder builder = new AlertDialog.Builder(activityM4659l3);
                        builder.setView(progressBar);
                        builder.setMessage(jha.m13177b(activityM4659l3, 18));
                        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                        AlertDialog alertDialogCreate = builder.create();
                        jcyVar2.m12897a(activityM4659l3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", r6);
                        Context applicationContext = ((LifecycleCallback) this.f23722a).m4659l().getApplicationContext();
                        jfo jfoVar = new jfo(this, alertDialogCreate, null);
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        jfp jfpVar = new jfp(jfoVar);
                        applicationContext.registerReceiver(jfpVar, intentFilter, 2);
                        jfpVar.f33912a = applicationContext;
                        if (jdm.m12932d(applicationContext)) {
                            return;
                        }
                        jfoVar.m13052a();
                        jfpVar.m13054a();
                        return;
                    }
                    return;
                default:
                    aia aiaVar = ((SwipeDismissBehavior) this.f23722a).f8068a;
                    if (aiaVar == null || !aiaVar.m751l()) {
                        return;
                    }
                    afb.m428i((View) this.f23724c, this);
                    return;
            }
        } catch (Throwable th) {
            ((fvy) this.f23722a).f23725a.mo13962f();
            throw th;
        }
        ((fvy) this.f23722a).f23725a.mo13962f();
        throw th;
    }
}
