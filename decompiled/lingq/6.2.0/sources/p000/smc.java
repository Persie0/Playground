package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: loaded from: classes.dex */
public final class smc implements s8c {

    /* JADX INFO: renamed from: b */
    public static final smc f61031b = new smc(0);

    /* JADX INFO: renamed from: c */
    public static final smc f61032c = new smc(1);

    /* JADX INFO: renamed from: d */
    public static final smc f61033d = new smc(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61034a;

    public /* synthetic */ smc(int i) {
        this.f61034a = i;
    }

    @Override // p000.s8c
    /* JADX INFO: renamed from: a */
    public final boolean mo10793a(int i) {
        zzjk zzjkVar;
        switch (this.f61034a) {
            case 0:
                switch (i) {
                    default:
                        switch (i) {
                            case 22:
                            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            case 24:
                            case 25:
                            case 26:
                            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case 28:
                            case 29:
                            case 30:
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
                break;
            case 1:
                return zzjd.zzb(i) != null;
            default:
                if (i == 0) {
                    zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i == 1) {
                    zzjkVar = zzjk.PURCHASES_UPDATED_ACTION;
                } else if (i != 2) {
                    zzjkVar = i != 3 ? null : zzjk.ALTERNATIVE_BILLING_ACTION;
                } else {
                    zzjkVar = zzjk.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return zzjkVar != null;
        }
    }
}
