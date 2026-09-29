package p000;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf4 implements fp6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49592a;

    public /* synthetic */ lf4(int i) {
        this.f49592a = i;
    }

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        switch (this.f49592a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                gp6 gp6Var = (gp6) obj2;
                gp6Var.mo12789a(mo7.f51639g, entry.getKey());
                gp6Var.mo12789a(mo7.f51640h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
