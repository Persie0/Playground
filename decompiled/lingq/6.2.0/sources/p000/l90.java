package p000;

import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l90 implements j90 {

    /* JADX INFO: renamed from: a */
    public float f49322a;

    /* JADX INFO: renamed from: b */
    public final Object f49323b;

    public l90(List list) {
        this.f49322a = -1.0f;
        this.f49323b = (kj4) list.get(0);
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: a */
    public boolean mo14348a(float f) {
        if (this.f49322a == f) {
            return true;
        }
        this.f49322a = f;
        return false;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: b */
    public kj4 mo14349b() {
        return (kj4) this.f49323b;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: c */
    public boolean mo14350c(float f) {
        return !((kj4) this.f49323b).m15271c();
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: d */
    public float mo14351d() {
        return ((kj4) this.f49323b).m15269a();
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: e */
    public float mo14352e() {
        return ((kj4) this.f49323b).m15270b();
    }

    /* JADX INFO: renamed from: f */
    public int m16030f(int i) {
        float f = this.f49322a;
        StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType = (StateListSizeChange$SizeChangeType) this.f49323b;
        if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PERCENT) {
            return (int) (f * i);
        }
        if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PIXELS) {
            return (int) f;
        }
        return 0;
    }

    @Override // p000.j90
    public boolean isEmpty() {
        return false;
    }

    public l90(StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType, float f) {
        this.f49323b = stateListSizeChange$SizeChangeType;
        this.f49322a = f;
    }
}
