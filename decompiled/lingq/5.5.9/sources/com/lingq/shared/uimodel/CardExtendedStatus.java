package com.lingq.shared.uimodel;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/uimodel/CardExtendedStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Null", "NotKnown", "Known", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public enum CardExtendedStatus {
    Null(-1),
    NotKnown(0),
    Known(3);

    private final int value;

    CardExtendedStatus(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
