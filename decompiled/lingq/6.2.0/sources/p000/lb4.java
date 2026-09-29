package p000;

import androidx.lifecycle.Lifecycle$State;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lb4 {

    /* JADX INFO: renamed from: a */
    public boolean f49395a;

    /* JADX INFO: renamed from: b */
    public boolean f49396b;

    /* JADX INFO: renamed from: c */
    public boolean f49397c;

    /* JADX INFO: renamed from: d */
    public final Object f49398d;

    /* JADX INFO: renamed from: e */
    public final Object f49399e;

    /* JADX INFO: renamed from: f */
    public final Object f49400f;

    /* JADX INFO: renamed from: g */
    public final Serializable f49401g;

    /* JADX INFO: renamed from: h */
    public Object f49402h;

    public lb4(kb4 kb4Var) {
        this.f49395a = kb4Var.f46967a;
        this.f49398d = kb4Var.f46968b;
        this.f49399e = kb4Var.f46969c;
        this.f49400f = kb4Var.f46970d;
        this.f49401g = kb4Var.f46971e;
        this.f49396b = kb4Var.f46973g;
        this.f49397c = kb4Var.f46972f;
        this.f49402h = kb4Var.f46975i;
    }

    /* JADX INFO: renamed from: a */
    public void m16060a() {
        vl8 vl8Var = (vl8) this.f49398d;
        if (vl8Var.mo256K().mo21327q() != Lifecycle$State.INITIALIZED) {
            C3386nv.m17633t("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f49395a) {
                C3386nv.m17633t("SavedStateRegistry was already attached.");
                return;
            }
            ((y47) this.f49399e).mo0a();
            vl8Var.mo256K().mo21323g(new oe3(this, 2));
            this.f49395a = true;
        }
    }

    public lb4(vl8 vl8Var, y47 y47Var) {
        this.f49398d = vl8Var;
        this.f49399e = y47Var;
        this.f49400f = new u06(16);
        this.f49401g = new LinkedHashMap();
        this.f49397c = true;
    }
}
