package com.tonyodev.fetch2;

import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/tonyodev/fetch2/Download;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "fetch2_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface Download extends Parcelable, Serializable {
    /* JADX INFO: renamed from: B */
    long getF32324K();

    /* JADX INFO: renamed from: F */
    long mo10574F();

    /* JADX INFO: renamed from: H */
    String mo10575H();

    /* JADX INFO: renamed from: K */
    boolean getF32325L();

    /* JADX INFO: renamed from: L */
    String mo10577L();

    /* JADX INFO: renamed from: N */
    int mo10578N();

    /* JADX INFO: renamed from: O */
    int getF32335e();

    /* JADX INFO: renamed from: P */
    NetworkType mo10580P();

    /* JADX INFO: renamed from: S */
    int mo10581S();

    /* JADX INFO: renamed from: V */
    String mo10582V();

    /* JADX INFO: renamed from: W */
    EnqueueAction getF32323J();

    /* JADX INFO: renamed from: Z */
    long mo10584Z();

    /* JADX INFO: renamed from: f */
    Error getF32341k();

    /* JADX INFO: renamed from: g */
    String mo10586g();

    /* JADX INFO: renamed from: getId */
    int getF32331a();

    /* JADX INFO: renamed from: i */
    Map<String, String> mo10587i();

    /* JADX INFO: renamed from: m */
    Status mo10588m();

    /* JADX INFO: renamed from: o */
    Extras mo10589o();

    /* JADX INFO: renamed from: p */
    Request mo10590p();

    /* JADX INFO: renamed from: u */
    long mo10591u();

    /* JADX INFO: renamed from: v */
    Priority mo10592v();
}
