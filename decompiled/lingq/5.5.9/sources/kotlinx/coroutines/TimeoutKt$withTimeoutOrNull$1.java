package kotlinx.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.TimeoutKt", m19206f = "Timeout.kt", m19207l = {100}, m19208m = "withTimeoutOrNull")
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public InterfaceC2056p f39996d;

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f39997e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f39998f;

    /* JADX INFO: renamed from: g */
    public int f39999g;

    public TimeoutKt$withTimeoutOrNull$1(InterfaceC9968c<? super TimeoutKt$withTimeoutOrNull$1> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f39998f = obj;
        this.f39999g |= Integer.MIN_VALUE;
        return TimeoutKt.m14314b(0L, null, this);
    }
}
