package kotlin.jvm.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5209i;
import dm.InterfaceC5205e;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Ldm/e;", "Ljava/io/Serializable;", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public abstract class Lambda<R> implements InterfaceC5205e<R>, Serializable {

    /* JADX INFO: renamed from: a */
    public final int f38120a;

    public Lambda(int i10) {
        this.f38120a = i10;
    }

    @Override // dm.InterfaceC5205e
    /* JADX INFO: renamed from: J */
    public final int mo10978J() {
        return this.f38120a;
    }

    public final String toString() {
        String strMo11129i = C5209i.f33277a.mo11129i(this);
        C5207g.m11110e(strMo11129i, "renderLambdaToString(this)");
        return strMo11129i;
    }
}
