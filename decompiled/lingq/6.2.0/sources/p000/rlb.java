package p000;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rlb implements fp6 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ rlb f59509b = new rlb(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ rlb f59510c = new rlb(1);

    /* JADX INFO: renamed from: d */
    public static final rlb f59511d = new rlb(2);

    /* JADX INFO: renamed from: e */
    public static final rlb f59512e = new rlb(3);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ rlb f59513f = new rlb(4);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ rlb f59514g = new rlb(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59515a;

    public /* synthetic */ rlb(int i) {
        this.f59515a = i;
    }

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        switch (this.f59515a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                gp6 gp6Var = (gp6) obj2;
                gp6Var.mo12789a(ylb.f70037g, entry.getKey());
                gp6Var.mo12789a(ylb.f70038h, entry.getValue());
                return;
            case 1:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                if (obj == null) {
                    return;
                } else {
                    ho2.m13383c();
                    return;
                }
            case 3:
                if (obj == null) {
                    return;
                } else {
                    ho2.m13383c();
                    return;
                }
            case 4:
                gp6 gp6Var2 = (gp6) obj2;
                Map.Entry entry2 = (Map.Entry) obj;
                gp6Var2.mo12789a(vmb.f65616g, entry2.getKey());
                gp6Var2.mo12789a(vmb.f65617h, entry2.getValue());
                return;
            case 5:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 6:
                Map.Entry entry3 = (Map.Entry) obj;
                gp6 gp6Var3 = (gp6) obj2;
                gp6Var3.mo12789a(uvb.f64437g, entry3.getKey());
                gp6Var3.mo12789a(uvb.f64438h, entry3.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
