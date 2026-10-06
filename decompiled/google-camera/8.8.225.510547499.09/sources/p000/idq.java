package p000;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idq extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final List f30488a;

    /* JADX INFO: renamed from: b */
    protected int f30489b;

    /* JADX INFO: renamed from: c */
    private idp f30490c;

    /* JADX INFO: renamed from: d */
    private int f30491d;

    /* JADX INFO: renamed from: e */
    private int f30492e;

    /* JADX INFO: renamed from: f */
    private boolean f30493f;

    public idq(Context context, dhv dhvVar) {
        this();
        List list = this.f30488a;
        dbh dbhVar = dbh.STANDARD;
        String string = context.getString(C0100R.string.stabilization_title_enhanced);
        String string2 = context.getString(C0100R.string.stabilization_description_enhanced);
        list.add(new idw(dbhVar, string, C0100R.drawable.quantum_gm_ic_stabilization_white_24, string2, string2, null));
        if (dhvVar.mo6184l(dhh.f11069V)) {
            List list2 = this.f30488a;
            dbh dbhVar2 = dbh.LOCKED;
            String string3 = context.getString(C0100R.string.stabilization_title_locking);
            String string4 = context.getString(C0100R.string.stabilization_description_locking);
            list2.add(new idw(dbhVar2, string3, C0100R.drawable.quantum_gm_ic_stabilization_lock_white_24, string4, string4, null));
        }
        if (dhvVar.mo6184l(dhh.f11070W)) {
            List list3 = this.f30488a;
            dbh dbhVar3 = dbh.ACTIVE;
            String string5 = context.getString(C0100R.string.stabilization_title_action);
            String string6 = context.getString(C0100R.string.stabilization_description_action);
            list3.add(new idw(dbhVar3, string5, C0100R.drawable.quantum_gm_ic_stabilization_action_white_24, string6, string6, null));
        }
        if (dhvVar.mo6184l(dhh.f11071X)) {
            List list4 = this.f30488a;
            dbh dbhVar4 = dbh.CINEMATIC;
            String string7 = context.getString(C0100R.string.stabilization_title_panning);
            String string8 = context.getString(C0100R.string.stabilization_description_panning);
            list4.add(new idw(dbhVar4, string7, C0100R.drawable.quantum_gm_ic_stabilization_pan_white_24, string8, string8, null));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11125a(idp idpVar, boolean z) {
        this.f30490c = idpVar;
        this.f30493f = z;
    }

    /* JADX INFO: renamed from: b */
    final void m11126b(int i) {
        if (getItem(i).f30535f || !this.f30493f) {
            this.f30489b = i;
            idp idpVar = this.f30490c;
            if (idpVar != null) {
                idpVar.mo10983a(m11129e());
            }
            jvd.m13538a();
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11127c(Object obj) {
        ListIterator listIterator = this.f30488a.listIterator();
        while (listIterator.hasNext()) {
            idw idwVar = (idw) listIterator.next();
            idwVar.getClass();
            if (obj.equals(idwVar.f30530a)) {
                m11126b(listIterator.previousIndex());
                return;
            }
        }
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final idw getItem(int i) {
        return (idw) this.f30488a.get(i);
    }

    /* JADX INFO: renamed from: e */
    public final idw m11129e() {
        return (idw) this.f30488a.get(this.f30489b);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f30488a.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        drj drjVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            view = LayoutInflater.from(context).inflate(C0100R.layout.item, (ViewGroup) null);
            drjVar = new drj(view);
            view.setTag(drjVar);
        } else {
            drjVar = (drj) view.getTag();
        }
        idw item = getItem(i);
        if (drjVar != null) {
            if (drjVar.f12398d != null) {
                if (this.f30491d == -1) {
                    this.f30491d = ((TextView) drjVar.f12395a).getCurrentTextColor();
                }
                if (this.f30492e == -1) {
                    this.f30492e = ((TextView) drjVar.f12399e).getCurrentTextColor();
                }
                if (this.f30489b == i) {
                    GradientDrawable gradientDrawable = (GradientDrawable) abt.m154a(context, C0100R.drawable.selected_item_background);
                    gradientDrawable.getClass();
                    gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(C0100R.dimen.menu_selected_item_radius));
                    gradientDrawable.setTint(kxk.m15024q(viewGroup, C0100R.attr.colorPrimaryContainer));
                    int iM15024q = kxk.m15024q(viewGroup, C0100R.attr.colorOnPrimaryContainer);
                    ((ImageView) drjVar.f12397c).setColorFilter(iM15024q);
                    ((TextView) drjVar.f12395a).setTextColor(iM15024q);
                    ((TextView) drjVar.f12399e).setTextColor(iM15024q);
                    ((ViewGroup) drjVar.f12398d).setBackground(gradientDrawable);
                } else {
                    ((ViewGroup) drjVar.f12398d).setBackgroundColor(0);
                    ((ImageView) drjVar.f12397c).setColorFilter(this.f30491d);
                    ((TextView) drjVar.f12395a).setTextColor(this.f30491d);
                    ((TextView) drjVar.f12399e).setTextColor(this.f30492e);
                }
            }
            ((ImageView) drjVar.f12397c).setImageResource(item.f30532c);
            Object obj = drjVar.f12396b;
            if (obj != null) {
                ((ImageView) obj).setImageResource(item.f30532c);
            }
            ((TextView) drjVar.f12395a).setText(item.f30531b);
            Object obj2 = drjVar.f12399e;
            if (obj2 != null) {
                ((TextView) obj2).setText(item.f30535f ? item.f30533d : item.f30534e);
            }
            if (item.f30535f) {
                ((TextView) drjVar.f12395a).setAlpha(1.0f);
                ((TextView) drjVar.f12399e).setAlpha(0.8f);
                ((ImageView) drjVar.f12397c).setAlpha(1.0f);
            } else {
                ((TextView) drjVar.f12395a).setAlpha(0.3f);
                ((TextView) drjVar.f12399e).setAlpha(0.3f);
                ((ImageView) drjVar.f12397c).setAlpha(0.3f);
            }
        }
        return view;
    }

    public idq(Context context) {
        this();
        List list = this.f30488a;
        gyx gyxVar = gyx.MEDIA_STORE;
        String string = context.getString(C0100R.string.default_title);
        String string2 = context.getString(C0100R.string.default_desc);
        list.add(new idw(gyxVar, string, C0100R.drawable.normal_mode_thumb, string2, string2, null));
        this.f30488a.add(new idw(gyx.MARS_STORE, context.getString(C0100R.string.mars_title), C0100R.drawable.quantum_gm_ic_lock_vd_theme_24, context.getString(C0100R.string.mars_desc), context.getString(C0100R.string.mars_not_available_reason_account), null));
    }

    public idq() {
        this.f30488a = new ArrayList();
        this.f30489b = -1;
        this.f30491d = -1;
        this.f30492e = -1;
        this.f30493f = true;
    }
}
