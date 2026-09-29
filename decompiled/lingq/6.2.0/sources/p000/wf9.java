package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wf9 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66761a;

    /* JADX INFO: renamed from: b */
    public final Serializable f66762b;

    /* JADX INFO: renamed from: c */
    public final Object f66763c;

    public wf9(Context context) {
        this.f66761a = 1;
        this.f66762b = new ArrayList();
        this.f66763c = context;
    }

    /* JADX INFO: renamed from: h */
    public static wf9 m23894h(Context context) {
        return new wf9(context);
    }

    /* JADX INFO: renamed from: d */
    public void m23895d(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(((Context) this.f66763c).getPackageManager());
        }
        if (component != null) {
            m23897g(component);
        }
        ((ArrayList) this.f66762b).add(intent);
    }

    /* JADX INFO: renamed from: f */
    public void m23896f(AbstractActivityC2935dp abstractActivityC2935dp) {
        Intent intentM19523s = pvc.m19523s(abstractActivityC2935dp);
        if (intentM19523s == null) {
            intentM19523s = pvc.m19523s(abstractActivityC2935dp);
        }
        if (intentM19523s != null) {
            ComponentName component = intentM19523s.getComponent();
            if (component == null) {
                component = intentM19523s.resolveActivity(((Context) this.f66763c).getPackageManager());
            }
            m23897g(component);
            ((ArrayList) this.f66762b).add(intentM19523s);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m23897g(ComponentName componentName) {
        Context context = (Context) this.f66763c;
        ArrayList arrayList = (ArrayList) this.f66762b;
        int size = arrayList.size();
        try {
            for (Intent intentM19524t = pvc.m19524t(context, componentName); intentM19524t != null; intentM19524t = pvc.m19524t(context, intentM19524t.getComponent())) {
                arrayList.add(size, intentM19524t);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m23898i() {
        ArrayList arrayList = (ArrayList) this.f66762b;
        if (arrayList.isEmpty()) {
            C3386nv.m17633t("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ((Context) this.f66763c).startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f66761a;
        Serializable serializable = this.f66762b;
        switch (i) {
            case 0:
                kg0 kg0Var = (kg0) this.f66763c;
                return ((xf9) kg0Var.f47158e).mo10172a(kg0Var, (String) serializable);
            default:
                return ((ArrayList) serializable).iterator();
        }
    }

    public String toString() {
        switch (this.f66761a) {
            case 0:
                si4 si4Var = new si4(", ", 1);
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                si4Var.m21394a(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public wf9(kg0 kg0Var, String str) {
        this.f66761a = 0;
        this.f66762b = str;
        this.f66763c = kg0Var;
    }
}
