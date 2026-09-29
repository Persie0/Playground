package com.tonyodev.fetch2;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2core.Downloader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FILE_NOT_CREATED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7¨\u00068"}, m13365d2 = {"Lcom/tonyodev/fetch2/Error;", "", "", "value", "I", "getValue", "()I", "", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "Lcom/tonyodev/fetch2core/Downloader$a;", "httpResponse", "Lcom/tonyodev/fetch2core/Downloader$a;", "getHttpResponse", "()Lcom/tonyodev/fetch2core/Downloader$a;", "setHttpResponse", "(Lcom/tonyodev/fetch2core/Downloader$a;)V", "<init>", "(Ljava/lang/String;IILjava/lang/Throwable;Lcom/tonyodev/fetch2core/Downloader$a;)V", "Companion", "a", "UNKNOWN", "NONE", "FILE_NOT_CREATED", "CONNECTION_TIMED_OUT", "UNKNOWN_HOST", "HTTP_NOT_FOUND", "WRITE_PERMISSION_DENIED", "NO_STORAGE_SPACE", "NO_NETWORK_CONNECTION", "EMPTY_RESPONSE_FROM_SERVER", "REQUEST_ALREADY_EXIST", "DOWNLOAD_NOT_FOUND", "FETCH_DATABASE_ERROR", "REQUEST_WITH_ID_ALREADY_EXIST", "REQUEST_WITH_FILE_PATH_ALREADY_EXIST", "REQUEST_NOT_SUCCESSFUL", "UNKNOWN_IO_ERROR", "FILE_NOT_FOUND", "FETCH_FILE_SERVER_URL_INVALID", "INVALID_CONTENT_HASH", "FAILED_TO_UPDATE_REQUEST", "FAILED_TO_ADD_COMPLETED_DOWNLOAD", "FETCH_FILE_SERVER_INVALID_RESPONSE", "REQUEST_DOES_NOT_EXIST", "ENQUEUE_NOT_SUCCESSFUL", "COMPLETED_NOT_ADDED_SUCCESSFULLY", "ENQUEUED_REQUESTS_ARE_NOT_DISTINCT", "FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE", "FAILED_TO_RENAME_FILE", "FILE_ALLOCATION_FAILED", "HTTP_CONNECTION_NOT_ALLOWED", "fetch2_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class Error {
    private static final /* synthetic */ Error[] $VALUES;
    public static final Error COMPLETED_NOT_ADDED_SUCCESSFULLY;
    public static final Error CONNECTION_TIMED_OUT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Error DOWNLOAD_NOT_FOUND;
    public static final Error EMPTY_RESPONSE_FROM_SERVER;
    public static final Error ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
    public static final Error ENQUEUE_NOT_SUCCESSFUL;
    public static final Error FAILED_TO_ADD_COMPLETED_DOWNLOAD;
    public static final Error FAILED_TO_RENAME_FILE;
    public static final Error FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
    public static final Error FAILED_TO_UPDATE_REQUEST;
    public static final Error FETCH_DATABASE_ERROR;
    public static final Error FETCH_FILE_SERVER_INVALID_RESPONSE;
    public static final Error FETCH_FILE_SERVER_URL_INVALID;
    public static final Error FILE_ALLOCATION_FAILED;
    public static final Error FILE_NOT_CREATED;
    public static final Error FILE_NOT_FOUND;
    public static final Error HTTP_CONNECTION_NOT_ALLOWED;
    public static final Error HTTP_NOT_FOUND;
    public static final Error INVALID_CONTENT_HASH;
    public static final Error NONE;
    public static final Error NO_NETWORK_CONNECTION;
    public static final Error NO_STORAGE_SPACE;
    public static final Error REQUEST_ALREADY_EXIST;
    public static final Error REQUEST_DOES_NOT_EXIST;
    public static final Error REQUEST_NOT_SUCCESSFUL;
    public static final Error REQUEST_WITH_FILE_PATH_ALREADY_EXIST;
    public static final Error REQUEST_WITH_ID_ALREADY_EXIST;
    public static final Error UNKNOWN;
    public static final Error UNKNOWN_HOST;
    public static final Error UNKNOWN_IO_ERROR;
    public static final Error WRITE_PERMISSION_DENIED;
    private Downloader.C4979a httpResponse;
    private Throwable throwable;
    private final int value;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.Error$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static Error m10594a(int i10) {
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    return Error.UNKNOWN;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    return Error.NONE;
                case 1:
                    return Error.FILE_NOT_CREATED;
                case 2:
                    return Error.CONNECTION_TIMED_OUT;
                case 3:
                    return Error.UNKNOWN_HOST;
                case 4:
                    return Error.HTTP_NOT_FOUND;
                case 5:
                    return Error.WRITE_PERMISSION_DENIED;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return Error.NO_STORAGE_SPACE;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return Error.NO_NETWORK_CONNECTION;
                case 8:
                    return Error.EMPTY_RESPONSE_FROM_SERVER;
                case 9:
                    return Error.REQUEST_ALREADY_EXIST;
                case 10:
                    return Error.DOWNLOAD_NOT_FOUND;
                case 11:
                    return Error.FETCH_DATABASE_ERROR;
                case 13:
                    return Error.REQUEST_WITH_ID_ALREADY_EXIST;
                case 15:
                    return Error.REQUEST_NOT_SUCCESSFUL;
                case 16:
                    return Error.UNKNOWN_IO_ERROR;
                case 17:
                    return Error.FILE_NOT_FOUND;
                case 19:
                    return Error.FETCH_FILE_SERVER_URL_INVALID;
                case 20:
                    return Error.INVALID_CONTENT_HASH;
                case 21:
                    return Error.FAILED_TO_UPDATE_REQUEST;
                case 22:
                    return Error.FAILED_TO_ADD_COMPLETED_DOWNLOAD;
                case 23:
                    return Error.FETCH_FILE_SERVER_INVALID_RESPONSE;
                case 24:
                    return Error.REQUEST_DOES_NOT_EXIST;
                case 25:
                    return Error.ENQUEUE_NOT_SUCCESSFUL;
                case 26:
                    return Error.COMPLETED_NOT_ADDED_SUCCESSFULLY;
                case 27:
                    return Error.ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
                case 28:
                    return Error.FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
                case 29:
                    return Error.FAILED_TO_RENAME_FILE;
                case 30:
                    return Error.FILE_ALLOCATION_FAILED;
                case 31:
                    return Error.HTTP_CONNECTION_NOT_ALLOWED;
            }
            return Error.UNKNOWN;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Error error = new Error("UNKNOWN", 0, -1, null, null, 6, null);
        UNKNOWN = error;
        Error error2 = new Error("NONE", 1, 0, null, null, 6, null);
        NONE = error2;
        Throwable th2 = null;
        int i10 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Error error3 = new Error("FILE_NOT_CREATED", 2, 1, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FILE_NOT_CREATED = error3;
        Error error4 = new Error("CONNECTION_TIMED_OUT", 3, 2, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        CONNECTION_TIMED_OUT = error4;
        Error error5 = new Error("UNKNOWN_HOST", 4, 3, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        UNKNOWN_HOST = error5;
        Error error6 = new Error("HTTP_NOT_FOUND", 5, 4, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        HTTP_NOT_FOUND = error6;
        Error error7 = new Error("WRITE_PERMISSION_DENIED", 6, 5, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        WRITE_PERMISSION_DENIED = error7;
        Error error8 = new Error("NO_STORAGE_SPACE", 7, 6, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        NO_STORAGE_SPACE = error8;
        Error error9 = new Error("NO_NETWORK_CONNECTION", 8, 7, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        NO_NETWORK_CONNECTION = error9;
        Error error10 = new Error("EMPTY_RESPONSE_FROM_SERVER", 9, 8, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        EMPTY_RESPONSE_FROM_SERVER = error10;
        Error error11 = new Error("REQUEST_ALREADY_EXIST", 10, 9, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        REQUEST_ALREADY_EXIST = error11;
        Error error12 = new Error("DOWNLOAD_NOT_FOUND", 11, 10, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        DOWNLOAD_NOT_FOUND = error12;
        Error error13 = new Error("FETCH_DATABASE_ERROR", 12, 11, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FETCH_DATABASE_ERROR = error13;
        Error error14 = new Error("REQUEST_WITH_ID_ALREADY_EXIST", 13, 13, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        REQUEST_WITH_ID_ALREADY_EXIST = error14;
        Error error15 = new Error("REQUEST_WITH_FILE_PATH_ALREADY_EXIST", 14, 14, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        REQUEST_WITH_FILE_PATH_ALREADY_EXIST = error15;
        Error error16 = new Error("REQUEST_NOT_SUCCESSFUL", 15, 15, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        REQUEST_NOT_SUCCESSFUL = error16;
        Error error17 = new Error("UNKNOWN_IO_ERROR", 16, 16, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        UNKNOWN_IO_ERROR = error17;
        Error error18 = new Error("FILE_NOT_FOUND", 17, 17, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FILE_NOT_FOUND = error18;
        Error error19 = new Error("FETCH_FILE_SERVER_URL_INVALID", 18, 19, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FETCH_FILE_SERVER_URL_INVALID = error19;
        Error error20 = new Error("INVALID_CONTENT_HASH", 19, 20, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        INVALID_CONTENT_HASH = error20;
        Error error21 = new Error("FAILED_TO_UPDATE_REQUEST", 20, 21, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FAILED_TO_UPDATE_REQUEST = error21;
        Error error22 = new Error("FAILED_TO_ADD_COMPLETED_DOWNLOAD", 21, 22, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FAILED_TO_ADD_COMPLETED_DOWNLOAD = error22;
        Error error23 = new Error("FETCH_FILE_SERVER_INVALID_RESPONSE", 22, 23, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FETCH_FILE_SERVER_INVALID_RESPONSE = error23;
        Error error24 = new Error("REQUEST_DOES_NOT_EXIST", 23, 24, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        REQUEST_DOES_NOT_EXIST = error24;
        Error error25 = new Error("ENQUEUE_NOT_SUCCESSFUL", 24, 25, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        ENQUEUE_NOT_SUCCESSFUL = error25;
        Error error26 = new Error("COMPLETED_NOT_ADDED_SUCCESSFULLY", 25, 26, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        COMPLETED_NOT_ADDED_SUCCESSFULLY = error26;
        Error error27 = new Error("ENQUEUED_REQUESTS_ARE_NOT_DISTINCT", 26, 27, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        ENQUEUED_REQUESTS_ARE_NOT_DISTINCT = error27;
        Error error28 = new Error("FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE", 27, 28, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE = error28;
        Error error29 = new Error("FAILED_TO_RENAME_FILE", 28, 29, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FAILED_TO_RENAME_FILE = error29;
        Error error30 = new Error("FILE_ALLOCATION_FAILED", 29, 30, th2, 0 == true ? 1 : 0, i10, defaultConstructorMarker);
        FILE_ALLOCATION_FAILED = error30;
        Error error31 = new Error("HTTP_CONNECTION_NOT_ALLOWED", 30, 31, null, null, 6, null);
        HTTP_CONNECTION_NOT_ALLOWED = error31;
        $VALUES = new Error[]{error, error2, error3, error4, error5, error6, error7, error8, error9, error10, error11, error12, error13, error14, error15, error16, error17, error18, error19, error20, error21, error22, error23, error24, error25, error26, error27, error28, error29, error30, error31};
        INSTANCE = new Companion();
    }

    private Error(String str, int i10, int i11, Throwable th2, Downloader.C4979a c4979a) {
        super(str, i10);
        this.value = i11;
        this.throwable = th2;
        this.httpResponse = c4979a;
    }

    public /* synthetic */ Error(String str, int i10, int i11, Throwable th2, Downloader.C4979a c4979a, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, (i12 & 2) != 0 ? null : th2, (i12 & 4) != 0 ? null : c4979a);
    }

    public static final Error valueOf(int i10) {
        INSTANCE.getClass();
        return Companion.m10594a(i10);
    }

    public static Error valueOf(String str) {
        return (Error) Enum.valueOf(Error.class, str);
    }

    public static Error[] values() {
        return (Error[]) $VALUES.clone();
    }

    public final Downloader.C4979a getHttpResponse() {
        return this.httpResponse;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setHttpResponse(Downloader.C4979a c4979a) {
        this.httpResponse = c4979a;
    }

    public final void setThrowable(Throwable th2) {
        this.throwable = th2;
    }
}
