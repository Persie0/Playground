package androidx.compose.p017ui.layout;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import fm.C5592a;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements InterfaceC2056p<Integer, Integer, Integer> {

    /* JADX INFO: renamed from: j */
    public static final AlignmentLineKt$LastBaseline$1 f3663j = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, C5592a.class, "max", "max(II)I", 1);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Integer mo1337m0(Integer num, Integer num2) {
        return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
    }
}
