package com.lingq.shared.uimodel;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m13365d2 = {"Lcom/lingq/shared/uimodel/ContentType;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "None", "Native", "MyImports", "External", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum ContentType {
    None("None"),
    Native("Native"),
    MyImports("My Imports"),
    External("External");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String key;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.ContentType$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.lingq.shared.uimodel.ContentType$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f21600a;

            static {
                int[] iArr = new int[ContentType.values().length];
                try {
                    iArr[ContentType.External.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ContentType.Native.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f21600a = iArr;
            }
        }
    }

    ContentType(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
