package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idv extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final List f30528a;

    /* JADX INFO: renamed from: b */
    public Object f30529b;

    public idv(List list, Object obj) {
        this.f30528a = list;
        this.f30529b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final int m11142a(Object obj) {
        for (int i = 0; i < this.f30528a.size(); i++) {
            if (((idw) this.f30528a.get(i)).f30530a == obj) {
                return i;
            }
        }
        throw new IllegalArgumentException("Invalid item key: ".concat(String.valueOf(String.valueOf(obj))));
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final idw getItem(int i) {
        return (idw) this.f30528a.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f30528a.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        djm djmVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            view = LayoutInflater.from(context).inflate(C0100R.layout.popup_menu_item, viewGroup, false);
            djmVar = new djm(view);
            view.setTag(djmVar);
        } else {
            djmVar = (djm) view.getTag();
        }
        if (djmVar == null) {
            return view;
        }
        idw idwVar = (idw) this.f30528a.get(i);
        ((ImageView) djmVar.f11788b).setImageResource(idwVar.f30532c);
        ((TextView) djmVar.f11789c).setText(idwVar.f30531b);
        ((TextView) djmVar.f11787a).setText(idwVar.f30535f ? idwVar.f30533d : idwVar.f30534e);
        view.setEnabled(idwVar.f30535f);
        if (idwVar.f30535f) {
            ((ImageView) djmVar.f11788b).setAlpha(1.0f);
        } else {
            ((ImageView) djmVar.f11788b).setAlpha(0.3f);
        }
        return view;
    }
}
