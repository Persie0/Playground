package p000;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptySet;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.C3263c;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public class kg4 extends AbstractC3668v0 {

    /* JADX INFO: renamed from: f */
    public final C3263c f47166f;

    /* JADX INFO: renamed from: g */
    public final SerialDescriptor f47167g;

    /* JADX INFO: renamed from: h */
    public int f47168h;

    /* JADX INFO: renamed from: i */
    public boolean f47169i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg4(df4 df4Var, C3263c c3263c, String str, SerialDescriptor serialDescriptor) {
        super(df4Var, str);
        df4Var.getClass();
        this.f47166f = c3263c;
        this.f47167g = serialDescriptor;
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: A */
    public int mo10319A(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        while (this.f47168h < serialDescriptor.mo3697e()) {
            int i = this.f47168h;
            this.f47168h = i + 1;
            String strM23027S = m23027S(serialDescriptor, i);
            int i2 = this.f47168h - 1;
            this.f47169i = false;
            if (!mo13893T().containsKey(strM23027S)) {
                boolean z = (this.f64638c.f35560a.f47128d || serialDescriptor.mo3701j(i2) || !serialDescriptor.mo3700i(i2).mo11826c()) ? false : true;
                this.f47169i = z;
                if (z) {
                }
            }
            this.f64640e.getClass();
            return i2;
        }
        return -1;
    }

    @Override // p000.AbstractC3668v0
    /* JADX INFO: renamed from: R */
    public String mo15175R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        df4 df4Var = this.f64638c;
        AbstractC3695vr.m23483A(df4Var, serialDescriptor);
        String strMo3698f = serialDescriptor.mo3698f(i);
        if (this.f64640e.f47131g && !mo13893T().f48242a.keySet().contains(strMo3698f)) {
            ic2 ic2Var = df4Var.f35562c;
            ho5 ho5Var = AbstractC3695vr.f65811f;
            C3006fm c3006fm = new C3006fm(13, serialDescriptor, df4Var);
            ic2Var.getClass();
            ConcurrentHashMap concurrentHashMap = ic2Var.f43919a;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            Object objMo0a = map != null ? map.get(ho5Var) : null;
            if (objMo0a == null) {
                objMo0a = null;
            }
            if (objMo0a == null) {
                objMo0a = c3006fm.mo0a();
                Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(ho5Var, objMo0a);
            }
            Map map2 = (Map) objMo0a;
            for (Object obj2 : mo13893T().f48242a.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strMo3698f;
    }

    @Override // p000.AbstractC3668v0
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public C3263c mo13893T() {
        return this.f47166f;
    }

    @Override // p000.AbstractC3668v0, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: b */
    public final df1 mo4079b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        SerialDescriptor serialDescriptor2 = this.f47167g;
        if (serialDescriptor != serialDescriptor2) {
            return super.mo4079b(serialDescriptor);
        }
        AbstractC3262b abstractC3262bM23032g = m23032g();
        String strMo3694a = serialDescriptor2.mo3694a();
        boolean z = abstractC3262bM23032g instanceof C3263c;
        df4 df4Var = this.f64638c;
        if (z) {
            return new kg4(df4Var, (C3263c) abstractC3262bM23032g, this.f64639d, serialDescriptor2);
        }
        throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(C3263c.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bM23032g.getClass()).m25414c() + " as the serialized body of " + strMo3694a, m23029V(), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bM23032g.toString(), -1).toString() : null));
    }

    @Override // p000.AbstractC3668v0
    /* JADX INFO: renamed from: c */
    public AbstractC3262b mo13894c(String str) {
        str.getClass();
        return (AbstractC3262b) AbstractC3194a.m15361N(str, mo13893T());
    }

    @Override // p000.AbstractC3668v0, p000.df1
    /* JADX INFO: renamed from: j */
    public void mo4086j(SerialDescriptor serialDescriptor) {
        Set setM19764A;
        serialDescriptor.getClass();
        df4 df4Var = this.f64638c;
        if (AbstractC3695vr.m23509t(df4Var, serialDescriptor) || (serialDescriptor.getKind() instanceof vg7)) {
            return;
        }
        AbstractC3695vr.m23483A(df4Var, serialDescriptor);
        if (this.f64640e.f47131g) {
            Set setM11129i = eh0.m11129i(serialDescriptor);
            ic2 ic2Var = df4Var.f35562c;
            ho5 ho5Var = AbstractC3695vr.f65811f;
            ic2Var.getClass();
            Map map = (Map) ic2Var.f43919a.get(serialDescriptor);
            Object obj = map != null ? map.get(ho5Var) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = EmptySet.f47640a;
            }
            setM19764A = AbstractC3489q9.m19764A(setM11129i, setKeySet);
        } else {
            setM19764A = eh0.m11129i(serialDescriptor);
        }
        for (String str : mo13893T().f48242a.keySet()) {
            if (!setM19764A.contains(str) && !fa4.m11650l(str, this.f64639d)) {
                throw new JsonDecodingException(fa4.m11656r(-1, ux5.m22986i('\'', "Encountered an unknown key '", str), m23029V(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", df4Var.f35560a.f47133i ? fa4.m11627A(mo13893T().toString(), -1).toString() : null));
            }
        }
    }

    @Override // p000.AbstractC3668v0, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: y */
    public final boolean mo4098y() {
        return !this.f47169i && super.mo4098y();
    }

    public /* synthetic */ kg4(df4 df4Var, C3263c c3263c, String str, int i) {
        this(df4Var, c3263c, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }
}
