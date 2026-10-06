package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.modeswitcher.MoreModesGrid;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class icq implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f30368a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f30369b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f30370c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ icr f30371d;

    public icq(icr icrVar, boolean z, boolean z2, boolean z3) {
        this.f30371d = icrVar;
        this.f30368a = z;
        this.f30369b = z2;
        this.f30370c = z3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x009d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0135  */
    /* JADX WARN: Code duplicated, block: B:23:0x0139  */
    /* JADX WARN: Code duplicated, block: B:25:0x0147  */
    /* JADX WARN: Code duplicated, block: B:26:0x014e  */
    /* JADX WARN: Code duplicated, block: B:32:0x017a  */
    /* JADX WARN: Code duplicated, block: B:34:0x017e  */
    /* JADX WARN: Code duplicated, block: B:36:0x018c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0193  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup, com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid] */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v46 */
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
    /* JADX INFO: renamed from: c */
    private final void m11073c() {
        jwn jwnVar;
        ?? r3;
        Drawable drawableM11412a;
        String strM11414d;
        mrm mrmVarM13056E;
        String strM11413c;
        mrm mrmVarM13056E2;
        icr icrVar = this.f30371d;
        ?? r2 = icrVar.f30376e;
        jvd.m13538a();
        if (r2.f7078e) {
            ArrayList arrayList = r2.f7075b;
            Context context = r2.getContext();
            Resources resources = context.getResources();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            r2.removeAllViews();
            int size = r2.f7075b.size() % 3;
            layoutInflater.getClass();
            ArrayList arrayList2 = r2.f7075b;
            int size2 = arrayList2.size();
            boolean z = false;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < size2) {
                icw icwVar = (icw) arrayList2.get(i);
                ikw ikwVar = icwVar.f30400a;
                TextView textView = (TextView) r3.inflate(C0100R.layout.more_modes_item, r2, z);
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) textView.getLayoutParams();
                ?? r17 = r3;
                layoutParams.rowSpec = GridLayout.spec(i2, 1, MoreModesGrid.BOTTOM, 0.0f);
                layoutParams.columnSpec = GridLayout.spec(i3, 1, MoreModesGrid.FILL, 1.0f);
                Drawable drawable = resources.getDrawable(C0100R.drawable.more_modes_icon_circle, r2.getContext().getTheme());
                if (ikwVar == ikw.ORNAMENT) {
                    mrm mrmVarM16828h = mrm.m16828h(new oes(r2.getContext().getPackageManager()).m18442d());
                    if (mrmVarM16828h.mo16813g()) {
                        r3 = layoutInflater;
                        drawableM11412a = (Drawable) mrmVarM16828h.mo16809c();
                    } else {
                        r3 = layoutInflater;
                        r3 = layoutInflater;
                        drawableM11412a = iku.m11410b(ikwVar).m11412a(r2.getContext().getResources());
                    }
                } else {
                    r3 = layoutInflater;
                    r3 = layoutInflater;
                    drawableM11412a = iku.m11410b(ikwVar).m11412a(r2.getContext().getResources());
                }
                Drawable drawableMutate = drawableM11412a.getConstantState().newDrawable().mutate();
                drawableMutate.setColorFilter(MoreModesGrid.f7073a);
                ArrayList arrayList3 = arrayList2;
                int i4 = size2;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawableMutate, r2.getContext().getDrawable(C0100R.drawable.notification_dot)});
                layerDrawable.setLayerGravity(0, 17);
                layerDrawable.setLayerGravity(1, 17);
                layerDrawable.setLayerGravity(2, 17);
                int dimensionPixelOffset = resources.getDimensionPixelOffset(C0100R.dimen.more_modes_grid_dot_inset);
                layerDrawable.setLayerInset(2, dimensionPixelOffset, 0, 0, dimensionPixelOffset);
                layerDrawable.getDrawable(2).setAlpha(true != icwVar.f30402c ? 0 : 255);
                int dimensionPixelSize = resources.getDimensionPixelSize(C0100R.dimen.more_modes_icon_diameter);
                layerDrawable.setLayerSize(0, dimensionPixelSize, dimensionPixelSize);
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, layerDrawable, (Drawable) null, (Drawable) null);
                if (ikwVar == ikw.ORNAMENT) {
                    mrm mrmVarM13057F = jfs.m13057F(r2.getContext());
                    if (mrmVarM13057F.mo16813g()) {
                        strM11414d = (String) mrmVarM13057F.mo16809c();
                    } else if (ikwVar == ikw.MEASURE) {
                        mrmVarM13056E = jfs.m13056E(r2.getContext());
                        if (mrmVarM13056E.mo16813g()) {
                            strM11414d = (String) mrmVarM13056E.mo16809c();
                        } else {
                            strM11414d = iku.m11410b(ikwVar).m11414d(r2.getContext().getResources());
                        }
                    } else {
                        strM11414d = iku.m11410b(ikwVar).m11414d(r2.getContext().getResources());
                    }
                } else if (ikwVar == ikw.MEASURE) {
                    mrmVarM13056E = jfs.m13056E(r2.getContext());
                    if (mrmVarM13056E.mo16813g()) {
                        strM11414d = (String) mrmVarM13056E.mo16809c();
                    } else {
                        strM11414d = iku.m11410b(ikwVar).m11414d(r2.getContext().getResources());
                    }
                } else {
                    strM11414d = iku.m11410b(ikwVar).m11414d(r2.getContext().getResources());
                }
                textView.setText(strM11414d);
                if (ikwVar == ikw.ORNAMENT) {
                    mrm mrmVarM13057F2 = jfs.m13057F(r2.getContext());
                    if (mrmVarM13057F2.mo16813g()) {
                        strM11413c = (String) mrmVarM13057F2.mo16809c();
                    } else if (ikwVar == ikw.MEASURE) {
                        mrmVarM13056E2 = jfs.m13056E(r2.getContext());
                        if (mrmVarM13056E2.mo16813g()) {
                            strM11413c = (String) mrmVarM13056E2.mo16809c();
                        } else {
                            strM11413c = iku.m11410b(ikwVar).m11413c(r2.getContext().getResources());
                        }
                    } else {
                        strM11413c = iku.m11410b(ikwVar).m11413c(r2.getContext().getResources());
                    }
                } else if (ikwVar == ikw.MEASURE) {
                    mrmVarM13056E2 = jfs.m13056E(r2.getContext());
                    if (mrmVarM13056E2.mo16813g()) {
                        strM11413c = (String) mrmVarM13056E2.mo16809c();
                    } else {
                        strM11413c = iku.m11410b(ikwVar).m11413c(r2.getContext().getResources());
                    }
                } else {
                    strM11413c = iku.m11410b(ikwVar).m11413c(r2.getContext().getResources());
                }
                textView.setContentDescription(strM11413c);
                textView.setOnClickListener(new ggf((MoreModesGrid) r2, ikwVar, 7));
                textView.setSoundEffectsEnabled(false);
                r2.addView(textView);
                icwVar.f30401b = textView;
                i3++;
                if (i3 == 3) {
                    i2++;
                    i3 = 0;
                } else if (i3 == (size == 0 ? 3 : size) && i2 == 0) {
                    i2 = 0;
                    i2++;
                    i3 = 0;
                }
                i++;
                r3 = r17;
                arrayList2 = arrayList3;
                size2 = i4;
                z = false;
            }
            r3 = layoutInflater;
            r2.f7078e = false;
        }
        ArrayList arrayList4 = new ArrayList();
        for (ikw ikwVar2 : icrVar.f30373b.keySet()) {
            if (icrVar.m11099y(ikwVar2) && (jwnVar = (jwn) icrVar.f30373b.get(ikwVar2)) != null) {
                arrayList4.add(jwnVar);
            }
        }
        if (!arrayList4.isEmpty()) {
            icrVar.f30373b.put(ikw.MORE_MODES, jwr.m13633c(arrayList4));
            icrVar.m11083i(ikw.MORE_MODES);
            icrVar.m11093s(ikw.MORE_MODES);
        }
        if (icrVar.f30379h) {
            icrVar.m11097w();
        }
        icrVar.f30384m = jpd.m13426g(true, 3000, null, null, icrVar.f30381j.getResources().getString(C0100R.string.modes_disabled_message), icrVar.f30381j, false, -1, 2);
        icrVar.f30388q.m13537d(icrVar.f30386o.mo3830a(new hmv(icrVar, 17), not.INSTANCE));
        icrVar.f30388q.m13537d(icrVar.f30387p.mo3830a(new hmv(icrVar, 18), not.INSTANCE));
        icrVar.f30378g = true;
    }

    /* JADX INFO: renamed from: d */
    private final void m11074d() {
        this.f30371d.m11085k(ikw.IMAX);
        this.f30371d.m11085k(ikw.PHOTO_SPHERE);
        if (this.f30368a) {
            this.f30371d.m11085k(ikw.ORNAMENT);
        }
        if (this.f30369b) {
            this.f30371d.m11085k(ikw.TIARA);
        }
        if (this.f30370c) {
            this.f30371d.m11085k(ikw.MEASURE);
        }
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        ((nbe) ((nbe) icr.f30372a.m17251b()).mo17276G((char) 4157)).mo17293r(KMNlNMe.RTMLRRWvFyJJMD, th);
        this.f30371d.f30382k.mo13961e("FinalizeMoreModes");
        m11074d();
        m11073c();
        this.f30371d.f30382k.mo13962f();
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        this.f30371d.f30382k.mo13961e("FinalizeMoreModes");
        m11074d();
        if (((Boolean) obj).booleanValue()) {
            this.f30371d.m11085k(ikw.LENS);
            this.f30371d.f30379h = true;
        }
        m11073c();
        this.f30371d.f30382k.mo13962f();
    }
}
