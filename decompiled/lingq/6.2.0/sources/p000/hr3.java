package p000;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: loaded from: classes2.dex */
public final class hr3 implements f94 {

    /* JADX INFO: renamed from: b */
    public static final hr3 f42824b = new hr3(0);

    /* JADX INFO: renamed from: c */
    public static final hr3 f42825c = new hr3(1);

    /* JADX INFO: renamed from: d */
    public static final hr3 f42826d = new hr3(2);

    /* JADX INFO: renamed from: e */
    public static final hr3 f42827e = new hr3(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42828a;

    public /* synthetic */ hr3(int i) {
        this.f42828a = i;
    }

    @Override // p000.f94
    public final boolean isInRange(int i) {
        switch (this.f42828a) {
            case 0:
                return HashType.forNumber(i) != null;
            case 1:
                return KeyData$KeyMaterialType.forNumber(i) != null;
            case 2:
                return KeyStatusType.forNumber(i) != null;
            default:
                return OutputPrefixType.forNumber(i) != null;
        }
    }
}
