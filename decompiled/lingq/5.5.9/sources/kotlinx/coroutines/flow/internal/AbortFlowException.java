package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC7117d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m13365d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "kotlinx-coroutines-core"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC7117d<?> f40287a;

    public AbortFlowException(InterfaceC7117d<?> interfaceC7117d) {
        super("Flow was aborted, no more elements needed");
        this.f40287a = interfaceC7117d;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
