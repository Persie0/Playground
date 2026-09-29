package android.support.v4.media;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.events.EventGroup;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.material.carousel.C2979a;
import com.lingq.entity.Playlist;
import dm.C5207g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.json.JSONObject;
import p139go.InterfaceC5852f;
import p142h1.AbstractC5872c;
import p142h1.C5877h;
import p290o6.InterfaceC7955f0;
import p321pc.InterfaceC8217a;
import p406u4.AbstractC9409f0;
import p406u4.C9425n0;
import p464wl.InterfaceC9968c;
import p479xa.C10129a;
import p529z9.C10463c;
import p529z9.InterfaceC10461a;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;

/* JADX INFO: renamed from: android.support.v4.media.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0140a implements InterfaceC10461a {
    /* JADX INFO: renamed from: C */
    public abstract void mo567C();

    /* JADX INFO: renamed from: D */
    public abstract void mo568D();

    /* JADX INFO: renamed from: F */
    public abstract void mo569F();

    /* JADX INFO: renamed from: H */
    public abstract void mo570H();

    /* JADX INFO: renamed from: I */
    public abstract void mo571I();

    /* JADX INFO: renamed from: J */
    public abstract void mo572J();

    /* JADX INFO: renamed from: K */
    public abstract void mo573K();

    /* JADX INFO: renamed from: L */
    public abstract void mo574L();

    /* JADX INFO: renamed from: M */
    public abstract void mo575M();

    /* JADX INFO: renamed from: N */
    public abstract void mo576N();

    /* JADX INFO: renamed from: O */
    public abstract ArrayList mo577O();

    /* JADX INFO: renamed from: P */
    public abstract void mo578P();

    /* JADX INFO: renamed from: Q */
    public abstract long mo579Q(ViewGroup viewGroup, AbstractC9409f0 abstractC9409f0, C9425n0 c9425n0, C9425n0 c9425n1);

    /* JADX INFO: renamed from: R */
    public abstract void mo580R();

    /* JADX INFO: renamed from: S */
    public abstract void mo581S(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    /* JADX INFO: renamed from: T */
    public abstract void mo582T(ArrayList arrayList);

    /* JADX INFO: renamed from: U */
    public abstract void mo583U(String str);

    /* JADX INFO: renamed from: V */
    public abstract View mo584V(int i10);

    /* JADX INFO: renamed from: W */
    public abstract C2979a mo585W(InterfaceC8217a interfaceC8217a, View view);

    /* JADX INFO: renamed from: X */
    public abstract void mo586X(int i10);

    /* JADX INFO: renamed from: Y */
    public abstract void mo587Y(Typeface typeface, boolean z10);

    /* JADX INFO: renamed from: Z */
    public abstract boolean mo588Z();

    @Override // p529z9.InterfaceC10461a
    /* JADX INFO: renamed from: a */
    public Metadata mo589a(C10463c c10463c) {
        ByteBuffer byteBuffer = c10463c.f12116c;
        byteBuffer.getClass();
        C10129a.m18990b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (c10463c.m13270o()) {
            return null;
        }
        return mo211p(c10463c, byteBuffer);
    }

    /* JADX INFO: renamed from: a0 */
    public abstract AbstractC5262v0 mo590a0(InterfaceC5852f interfaceC5852f);

    /* JADX INFO: renamed from: b0 */
    public void mo591b0(JSONObject jSONObject, String str, Context context) {
        Log.i("CleverTapResponse", "Done processing response!");
    }

    /* JADX INFO: renamed from: c0 */
    public abstract void mo592c0(JSONObject jSONObject, boolean z10);

    /* JADX INFO: renamed from: d */
    public abstract void mo593d();

    /* JADX INFO: renamed from: d0 */
    public abstract void mo594d0();

    /* JADX INFO: renamed from: e0 */
    public abstract Future mo595e0(Context context, JSONObject jSONObject, int i10);

    /* JADX INFO: renamed from: f0 */
    public abstract AbstractC5257t mo596f0(InterfaceC5852f interfaceC5852f);

    /* JADX INFO: renamed from: g0 */
    public void mo525g0(CallableMemberDescriptor callableMemberDescriptor, Collection collection) {
        C5207g.m11111f(callableMemberDescriptor, "member");
        callableMemberDescriptor.mo11847G0(collection);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo597h();

    /* JADX INFO: renamed from: h0 */
    public abstract Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: i */
    public abstract void mo526i(CallableMemberDescriptor callableMemberDescriptor);

    /* JADX INFO: renamed from: i0 */
    public abstract Object mo599i0(List list, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: j */
    public abstract void mo600j(C9425n0 c9425n0);

    /* JADX INFO: renamed from: j0 */
    public abstract void mo601j0();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo602o(AbstractC5872c abstractC5872c);

    /* JADX INFO: renamed from: p */
    public abstract Metadata mo211p(C10463c c10463c, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: r */
    public abstract Object mo603r(Playlist playlist, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: s */
    public abstract Object mo604s(ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: v */
    public abstract void mo605v();

    /* JADX INFO: renamed from: x */
    public abstract void mo606x(Context context, EventGroup eventGroup);

    /* JADX INFO: renamed from: y */
    public abstract Object mo607y(C5877h c5877h);

    /* JADX INFO: renamed from: z */
    public abstract InterfaceC7955f0 mo608z();
}
