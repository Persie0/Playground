package p000;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.lifecycle.Lifecycle$State;
import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: renamed from: sf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3572sf implements uoc {

    /* JADX INFO: renamed from: a */
    public final Object f60774a;

    public AbstractC3572sf(int i) {
        switch (i) {
            case 4:
                this.f60774a = new HashMap();
                break;
            case 5:
                t56 t56Var = e84.f36837a;
                this.f60774a = new t56();
                break;
            case 6:
                this.f60774a = new qn3(12);
                break;
            case 7:
                this.f60774a = new Object();
                break;
            default:
                this.f60774a = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo3704A(Level level);

    /* JADX INFO: renamed from: B */
    public abstract void mo3705B(rmd rmdVar);

    /* JADX INFO: renamed from: C */
    public void mo3706C(RuntimeException runtimeException, rmd rmdVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    /* JADX INFO: renamed from: D */
    public void mo12359D() {
        tic ticVar = ((kjc) this.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: a */
    public s46 mo5907a() {
        throw null;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: b */
    public xcc mo5909b() {
        throw null;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: c */
    public gr7 mo5911c() {
        throw null;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: d */
    public tic mo5913d() {
        throw null;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: e */
    public Context mo5915e() {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo21323g(tb5 tb5Var);

    /* JADX INFO: renamed from: h */
    public boolean m21324h(int i, vj3 vj3Var, Object obj) {
        ArrayList arrayList = vj3Var.f65503a;
        if (arrayList == null) {
            m21325i(i, vj3Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof oj3)) {
                if (!(obj2 instanceof vj3)) {
                    C3386nv.m17632s(obj2, "Unexpected child source info ");
                    break;
                }
                if (m21324h(i, (vj3) obj2, obj)) {
                    m21325i(0, vj3Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                m21325i(0, vj3Var, obj2);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m21325i(int i, vj3 vj3Var, Object obj) {
        ((ArrayList) this.f60774a).add(new re1(i, null, null));
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo11541j(yv8 yv8Var);

    /* JADX INFO: renamed from: k */
    public abstract void mo11542k();

    /* JADX INFO: renamed from: l */
    public abstract Object mo16603l(Object obj);

    /* JADX INFO: renamed from: m */
    public abstract AbstractC1126a mo3497m(AbstractC1126a abstractC1126a);

    /* JADX INFO: renamed from: n */
    public abstract void mo11543n();

    /* JADX INFO: renamed from: o */
    public Object m21326o(Object obj) {
        synchronized (((HashMap) this.f60774a)) {
            try {
                if (((HashMap) this.f60774a).containsKey(obj)) {
                    return ((HashMap) this.f60774a).get(obj);
                }
                Object objMo16603l = mo16603l(obj);
                ((HashMap) this.f60774a).put(obj, objMo16603l);
                return objMo16603l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract du4 mo12211p(int i, int i2, int i3, long j);

    /* JADX INFO: renamed from: q */
    public abstract Lifecycle$State mo21327q();

    /* JADX INFO: renamed from: r */
    public List m21328r(cu4 cu4Var, int i, long j) {
        t56 t56Var = (t56) this.f60774a;
        List list = (List) t56Var.m10152b(i);
        if (list != null) {
            return list;
        }
        List listM9896b = cu4Var.m9896b(i);
        int size = listM9896b.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((ct5) listM9896b.get(i2)).mo1514r(j));
        }
        t56Var.m21850i(i, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public boolean m21329s() {
        SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM349a;
        ze9 ze9Var = (ze9) this.f60774a;
        View view = ze9Var.f71466c.f5692d0;
        if (view != null) {
            SpecialEffectsController$Operation$State.Companion.getClass();
            specialEffectsController$Operation$StateM349a = af9.m349a(view);
        } else {
            specialEffectsController$Operation$StateM349a = null;
        }
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = ze9Var.f71464a;
        if (specialEffectsController$Operation$StateM349a == specialEffectsController$Operation$State) {
            return true;
        }
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
        return (specialEffectsController$Operation$StateM349a == specialEffectsController$Operation$State2 || specialEffectsController$Operation$State == specialEffectsController$Operation$State2) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public Map mo3498t() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC1126a mo3499u(ByteString byteString);

    /* JADX INFO: renamed from: v */
    public void m21330v(int i, Object obj, vj3 vj3Var, Object obj2) {
        if (fa4.m11650l(obj, we1.f66679a)) {
            m21325i(i, vj3Var, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public abstract vi3 mo11544w(yv8 yv8Var);

    /* JADX INFO: renamed from: x */
    public abstract void mo21331x(tb5 tb5Var);

    /* JADX INFO: renamed from: y */
    public abstract void mo11545y(cu0 cu0Var);

    /* JADX INFO: renamed from: z */
    public abstract void mo3500z(AbstractC1126a abstractC1126a);

    public AbstractC3572sf(kjc kjcVar) {
        lda.m16130p(kjcVar);
        this.f60774a = kjcVar;
    }

    public /* synthetic */ AbstractC3572sf(Object obj) {
        this.f60774a = obj;
    }

    public AbstractC3572sf(ze9 ze9Var) {
        ze9Var.getClass();
        this.f60774a = ze9Var;
    }
}
