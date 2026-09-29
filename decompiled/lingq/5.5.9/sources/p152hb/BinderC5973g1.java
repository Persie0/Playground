package p152hb;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.zak;
import ec.BinderC5390c;
import java.util.Set;
import p071dc.C5143b;
import p071dc.C5146e;
import p071dc.InterfaceC5147f;
import p176ib.C6254b;
import p289o5.RunnableC7933m;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5973g1 extends BinderC5390c implements AbstractC2544c.a, AbstractC2544c.b {

    /* JADX INFO: renamed from: h */
    public static final C5143b f35486h = C5146e.f33122a;

    /* JADX INFO: renamed from: a */
    public final Context f35487a;

    /* JADX INFO: renamed from: b */
    public final Handler f35488b;

    /* JADX INFO: renamed from: c */
    public final C5143b f35489c = f35486h;

    /* JADX INFO: renamed from: d */
    public final Set<Scope> f35490d;

    /* JADX INFO: renamed from: e */
    public final C6254b f35491e;

    /* JADX INFO: renamed from: f */
    public InterfaceC5147f f35492f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5970f1 f35493g;

    public BinderC5973g1(Context context, HandlerC9517f handlerC9517f, C6254b c6254b) {
        this.f35487a = context;
        this.f35488b = handlerC9517f;
        this.f35491e = c6254b;
        this.f35490d = c6254b.f36440b;
    }

    @Override // ec.InterfaceC5392e
    /* JADX INFO: renamed from: M */
    public final void mo11558M(zak zakVar) {
        this.f35488b.post(new RunnableC7933m(this, zakVar, 2));
    }

    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: b1 */
    public final void mo12397b1(Bundle bundle) {
        this.f35492f.mo10920t(this);
    }

    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: h */
    public final void mo12398h(int i10) {
        this.f35492f.mo7545i();
    }

    @Override // p152hb.InterfaceC5980j
    /* JADX INFO: renamed from: j */
    public final void mo494j(ConnectionResult connectionResult) {
        ((C6017v0) this.f35493g).m12468b(connectionResult);
    }
}
