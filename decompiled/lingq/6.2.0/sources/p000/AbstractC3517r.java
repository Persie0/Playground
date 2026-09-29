package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3517r implements InterfaceC3510qt {

    /* JADX INFO: renamed from: a */
    public final Object f58432a;

    /* JADX INFO: renamed from: b */
    public Object f58433b;

    /* JADX INFO: renamed from: c */
    public final Serializable f58434c;

    public AbstractC3517r(Class cls, zj7... zj7VarArr) {
        this.f58432a = cls;
        HashMap map = new HashMap();
        for (zj7 zj7Var : zj7VarArr) {
            boolean zContainsKey = map.containsKey(zj7Var.f71654a);
            Class cls2 = zj7Var.f71654a;
            if (zContainsKey) {
                C3386nv.m17625k(cls2.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                throw null;
            }
            map.put(cls2, zj7Var);
        }
        if (zj7VarArr.length > 0) {
            this.f58434c = zj7VarArr[0].f71654a;
        } else {
            this.f58434c = Void.class;
        }
        this.f58433b = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: b */
    public void m20226b() {
        ((ArrayList) this.f58434c).clear();
        this.f58433b = this.f58432a;
        mo4608p();
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: c */
    public void mo1300c(Object obj) {
        ((ArrayList) this.f58434c).add(this.f58433b);
        this.f58433b = obj;
    }

    /* JADX INFO: renamed from: d */
    public TinkFipsUtil$AlgorithmFipsCompatibility mo4441d() {
        return TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo225i();

    /* JADX INFO: renamed from: j */
    public abstract AbstractC3572sf mo226j();

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: k */
    public void mo1305k() {
        ArrayList arrayList = (ArrayList) this.f58434c;
        this.f58433b = arrayList.remove(arrayList.size() - 1);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: n */
    public Object mo1307n() {
        return this.f58433b;
    }

    /* JADX INFO: renamed from: o */
    public abstract KeyData$KeyMaterialType mo227o();

    /* JADX INFO: renamed from: p */
    public abstract void mo4608p();

    /* JADX INFO: renamed from: q */
    public abstract AbstractC1126a mo228q(ByteString byteString);

    /* JADX INFO: renamed from: r */
    public abstract void mo229r(AbstractC1126a abstractC1126a);

    public AbstractC3517r(Object obj) {
        this.f58432a = obj;
        this.f58434c = new ArrayList();
        this.f58433b = obj;
    }
}
