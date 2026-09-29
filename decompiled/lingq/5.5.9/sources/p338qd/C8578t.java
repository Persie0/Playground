package p338qd;

import android.content.Context;
import bo.InterfaceC1626d;
import co.InterfaceC2076h;
import com.google.android.play.core.assetpacks.C3111b;
import com.google.android.play.core.assetpacks.C3117h;
import com.google.android.play.core.assetpacks.C3118i;
import dm.C5207g;
import java.util.List;
import kn.AbstractC6731a;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p372rm.InterfaceC8838g;
import p541zn.C10544h;
import td.C9269q;
import td.C9270r;
import td.InterfaceC9268p;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: qd.t */
/* JADX INFO: loaded from: classes.dex */
public final class C8578t implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final Object f45999a;

    /* JADX INFO: renamed from: b */
    public final Object f46000b;

    /* JADX INFO: renamed from: c */
    public final Object f46001c;

    /* JADX INFO: renamed from: d */
    public final Object f46002d;

    /* JADX INFO: renamed from: e */
    public final Object f46003e;

    /* JADX INFO: renamed from: f */
    public final Object f46004f;

    /* JADX INFO: renamed from: g */
    public final Object f46005g;

    /* JADX INFO: renamed from: h */
    public final Object f46006h;

    /* JADX INFO: renamed from: i */
    public final Object f46007i;

    public C8578t(C8586v1 c8586v1, InterfaceC9271s interfaceC9271s, InterfaceC9271s interfaceC9271s2, C9269q c9269q, InterfaceC9271s interfaceC9271s3, InterfaceC9271s interfaceC9271s4, InterfaceC9271s interfaceC9271s5, InterfaceC9271s interfaceC9271s6, InterfaceC9271s interfaceC9271s7) {
        this.f45999a = c8586v1;
        this.f46000b = interfaceC9271s;
        this.f46001c = interfaceC9271s2;
        this.f46002d = c9269q;
        this.f46003e = interfaceC9271s3;
        this.f46004f = interfaceC9271s4;
        this.f46005g = interfaceC9271s5;
        this.f46006h = interfaceC9271s6;
        this.f46007i = interfaceC9271s7;
    }

    public C8578t(C10544h c10544h, InterfaceC6733c interfaceC6733c, InterfaceC8838g interfaceC8838g, C6735e c6735e, C6736f c6736f, AbstractC6731a abstractC6731a, InterfaceC1626d interfaceC1626d, TypeDeserializer typeDeserializer, List list) {
        String strMo5302c;
        C5207g.m11111f(c10544h, "components");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(interfaceC8838g, "containingDeclaration");
        C5207g.m11111f(c6735e, "typeTable");
        C5207g.m11111f(c6736f, "versionRequirementTable");
        C5207g.m11111f(abstractC6731a, "metadataVersion");
        C5207g.m11111f(list, "typeParameters");
        this.f45999a = c10544h;
        this.f46000b = interfaceC6733c;
        this.f46001c = interfaceC8838g;
        this.f46002d = c6735e;
        this.f46003e = c6736f;
        this.f46004f = abstractC6731a;
        this.f46005g = interfaceC1626d;
        InterfaceC1626d interfaceC1626d2 = interfaceC1626d;
        this.f46006h = new TypeDeserializer(this, typeDeserializer, list, "Deserializer for \"" + interfaceC8838g.mo11874a() + '\"', (interfaceC1626d2 == null || (strMo5302c = interfaceC1626d2.mo5302c()) == null) ? "[container not found]" : strMo5302c);
        this.f46007i = new MemberDeserializer(this);
    }

    /* JADX INFO: renamed from: a */
    public final C8578t m16777a(InterfaceC8838g interfaceC8838g, List list, InterfaceC6733c interfaceC6733c, C6735e c6735e, C6736f c6736f, AbstractC6731a abstractC6731a) {
        C5207g.m11111f(interfaceC8838g, "descriptor");
        C5207g.m11111f(list, "typeParameterProtos");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        C5207g.m11111f(c6736f, "versionRequirementTable");
        C5207g.m11111f(abstractC6731a, "metadataVersion");
        return new C8578t((C10544h) this.f45999a, interfaceC6733c, interfaceC8838g, c6735e, abstractC6731a.f37946b == 1 && abstractC6731a.f37947c >= 4 ? c6736f : (C6736f) this.f46003e, abstractC6731a, (InterfaceC1626d) this.f46005g, (TypeDeserializer) this.f46006h, list);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2076h m16778c() {
        return ((C10544h) this.f45999a).f52579a;
    }

    @Override // td.InterfaceC9271s
    public final /* bridge */ /* synthetic */ Object zza() {
        Context contextM16807a = ((C8586v1) ((InterfaceC9271s) this.f45999a)).m16807a();
        Object objZza = ((InterfaceC9271s) this.f46000b).zza();
        Object objZza2 = ((InterfaceC9271s) this.f46001c).zza();
        InterfaceC9268p interfaceC9268pM17630a = C9270r.m17630a((InterfaceC9271s) this.f46002d);
        Object objZza3 = ((InterfaceC9271s) this.f46003e).zza();
        return new C3111b(contextM16807a, (C3118i) objZza, (C3117h) objZza2, interfaceC9268pM17630a, (C8561n0) objZza3, (C8534e0) ((InterfaceC9271s) this.f46004f).zza(), C9270r.m17630a((InterfaceC9271s) this.f46005g), C9270r.m17630a((InterfaceC9271s) this.f46006h), (C8544h1) ((InterfaceC9271s) this.f46007i).zza());
    }
}
