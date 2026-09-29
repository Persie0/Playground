package com.lingq.core.network.adapters;

import p000.fa4;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public interface NetworkResponse<T> {

    public static final class Success<T> implements NetworkResponse<T> {
        private final T data;

        public Success(T t) {
            this.data = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T t) {
            return new Success<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && fa4.m11650l(this.data, ((Success) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.data + ")";
        }
    }

    public static final class Error implements NetworkResponse {
        private final String body;
        private final Integer code;
        private final String message;
        private final Throwable throwable;

        public /* synthetic */ Error(String str, Throwable th, Integer num, String str2, int i, y52 y52Var) {
            this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, Throwable th, Integer num, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                th = error.throwable;
            }
            if ((i & 4) != 0) {
                num = error.code;
            }
            if ((i & 8) != 0) {
                str2 = error.body;
            }
            return error.copy(str, th, num, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.throwable;
        }

        public final Integer component3() {
            return this.code;
        }

        public final String component4() {
            return this.body;
        }

        public final Error copy(String str, Throwable th, Integer num, String str2) {
            str.getClass();
            return new Error(str, th, num, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return fa4.m11650l(this.message, error.message) && fa4.m11650l(this.throwable, error.throwable) && fa4.m11650l(this.code, error.code) && fa4.m11650l(this.body, error.body);
        }

        public final String getBody() {
            return this.body;
        }

        public final Integer getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.throwable;
            int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
            Integer num = this.code;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.body;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Error(message=" + this.message + ", throwable=" + this.throwable + ", code=" + this.code + ", body=" + this.body + ")";
        }

        public Error(String str, Throwable th, Integer num, String str2) {
            str.getClass();
            this.message = str;
            this.throwable = th;
            this.code = num;
            this.body = str2;
        }
    }
}
