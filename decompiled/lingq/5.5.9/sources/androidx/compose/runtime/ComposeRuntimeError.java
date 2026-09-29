package androidx.compose.runtime;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final String f2885a;

    public ComposeRuntimeError(String str) {
        C5207g.m11111f(str, "message");
        this.f2885a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2885a;
    }
}
