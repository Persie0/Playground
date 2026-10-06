package p000;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.Button;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.p014ui.preference.ManagedSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedSwitchPreference;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iec implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30545a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30546b;

    public /* synthetic */ iec(Button button, int i) {
        this.f30546b = i;
        this.f30545a = button;
    }

    public /* synthetic */ iec(ManagedSwitchPreference managedSwitchPreference, int i) {
        this.f30546b = i;
        this.f30545a = managedSwitchPreference;
    }

    public /* synthetic */ iec(MaterialManagedSwitchPreference materialManagedSwitchPreference, int i) {
        this.f30546b = i;
        this.f30545a = materialManagedSwitchPreference;
    }

    public /* synthetic */ iec(iha ihaVar, int i) {
        this.f30546b = i;
        this.f30545a = ihaVar;
    }

    public /* synthetic */ iec(imf imfVar, int i) {
        this.f30546b = i;
        this.f30545a = imfVar;
    }

    public /* synthetic */ iec(ipb ipbVar, int i) {
        this.f30546b = i;
        this.f30545a = ipbVar;
    }

    public /* synthetic */ iec(irs irsVar, int i) {
        this.f30546b = i;
        this.f30545a = irsVar;
    }

    public /* synthetic */ iec(iyv iyvVar, int i) {
        this.f30546b = i;
        this.f30545a = iyvVar;
    }

    public iec(mhc mhcVar, int i) {
        this.f30546b = i;
        this.f30545a = mhcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [gyi, java.lang.Object] */
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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30546b) {
            case 0:
                Object obj = this.f30545a;
                int i = ManagedSwitchPreference.f7107n;
                ((Button) obj).performClick();
                break;
            case 1:
                ((ManagedSwitchPreference) this.f30545a).f7116i.run();
                break;
            case 2:
                ((MaterialManagedSwitchPreference) this.f30545a).f7144f.run();
                break;
            case 3:
                ((Button) this.f30545a).performClick();
                break;
            case 4:
                iha ihaVar = (iha) this.f30545a;
                Runnable runnable = ihaVar.f30925h;
                if (runnable != null) {
                    runnable.run();
                }
                Iterator it = ihaVar.f30921d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                break;
            case 5:
                ?? r12 = this.f30545a;
                imf imfVar = (imf) r12;
                imfVar.f31499h.m9973h(r12);
                imfVar.f31495d.mo7485g(imfVar.f31502k);
                imfVar.f31497f.mo10033e(gzy.f27021ae, Long.valueOf(imfVar.f31500i));
                imfVar.f31498g.mo8167al(9, imfVar.f31503l, imfVar.f31500i, 0, 0);
                imfVar.f31493b.mo11471d();
                break;
            case 6:
                ipb ipbVar = (ipb) this.f30545a;
                ipbVar.f31672a.mo11565a();
                ipbVar.f31673b.mo11560b();
                break;
            case 7:
                ((ipb) this.f30545a).f31672a.mo11568d();
                break;
            case 8:
                ((ipb) this.f30545a).f31673b.mo11561c();
                break;
            case 9:
                irs irsVar = (irs) this.f30545a;
                irsVar.m11664f();
                irsVar.f31940g.mo11649a(false);
                break;
            case 10:
                AmbientMode.AmbientController ambientController = ((iyv) this.f30545a).f32690e;
                if (ambientController != null) {
                    ambientController.m1649v();
                    break;
                }
                break;
            case 11:
                AmbientMode.AmbientController ambientController2 = ((iyv) this.f30545a).f32690e;
                if (ambientController2 != null) {
                    ambientController2.m1648u();
                    break;
                }
                break;
            default:
                mhc mhcVar = (mhc) this.f30545a;
                if (mhcVar.f40480d && mhcVar.isShowing()) {
                    mhc mhcVar2 = (mhc) this.f30545a;
                    if (!mhcVar2.f40482f) {
                        TypedArray typedArrayObtainStyledAttributes = mhcVar2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        mhcVar2.f40481e = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        mhcVar2.f40482f = true;
                    }
                    if (mhcVar2.f40481e) {
                        ((mhc) this.f30545a).cancel();
                    }
                    break;
                }
                break;
        }
    }
}
