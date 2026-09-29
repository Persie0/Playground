package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import mo.C7661i;
import org.json.JSONObject;
import p067d8.C5056a0;
import p067d8.C5086z;
import p173i8.C6205a;
import p274n8.C7725j;
import p274n8.C7728m;
import p291o7.C8004n;
import p402u0.C9371n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "a", "c", "Request", "Result", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C2323b();

    /* JADX INFO: renamed from: a */
    public LoginMethodHandler[] f11601a;

    /* JADX INFO: renamed from: b */
    public int f11602b;

    /* JADX INFO: renamed from: c */
    public Fragment f11603c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2324c f11604d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2322a f11605e;

    /* JADX INFO: renamed from: f */
    public boolean f11606f;

    /* JADX INFO: renamed from: g */
    public Request f11607g;

    /* JADX INFO: renamed from: h */
    public Map<String, String> f11608h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f11609i;

    /* JADX INFO: renamed from: j */
    public C7725j f11610j;

    /* JADX INFO: renamed from: k */
    public int f11611k;

    /* JADX INFO: renamed from: l */
    public int f11612l;

    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C2320a();

        /* JADX INFO: renamed from: H */
        public boolean f11613H;

        /* JADX INFO: renamed from: I */
        public boolean f11614I;

        /* JADX INFO: renamed from: J */
        public final String f11615J;

        /* JADX INFO: renamed from: K */
        public final String f11616K;

        /* JADX INFO: renamed from: L */
        public final String f11617L;

        /* JADX INFO: renamed from: M */
        public final CodeChallengeMethod f11618M;

        /* JADX INFO: renamed from: a */
        public final LoginBehavior f11619a;

        /* JADX INFO: renamed from: b */
        public Set<String> f11620b;

        /* JADX INFO: renamed from: c */
        public final DefaultAudience f11621c;

        /* JADX INFO: renamed from: d */
        public final String f11622d;

        /* JADX INFO: renamed from: e */
        public String f11623e;

        /* JADX INFO: renamed from: f */
        public boolean f11624f;

        /* JADX INFO: renamed from: g */
        public final String f11625g;

        /* JADX INFO: renamed from: h */
        public final String f11626h;

        /* JADX INFO: renamed from: i */
        public final String f11627i;

        /* JADX INFO: renamed from: j */
        public String f11628j;

        /* JADX INFO: renamed from: k */
        public boolean f11629k;

        /* JADX INFO: renamed from: l */
        public final LoginTargetApp f11630l;

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Request$a */
        public static final class C2320a implements Parcelable.Creator<Request> {
            @Override // android.os.Parcelable.Creator
            public final Request createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "source");
                return new Request(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Request[] newArray(int i10) {
                return new Request[i10];
            }
        }

        public Request(Parcel parcel) {
            String str = C5056a0.f32910a;
            String string = parcel.readString();
            C5056a0.m10746d(string, "loginBehavior");
            this.f11619a = LoginBehavior.valueOf(string);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f11620b = new HashSet(arrayList);
            String string2 = parcel.readString();
            this.f11621c = string2 != null ? DefaultAudience.valueOf(string2) : DefaultAudience.NONE;
            String string3 = parcel.readString();
            C5056a0.m10746d(string3, "applicationId");
            this.f11622d = string3;
            String string4 = parcel.readString();
            C5056a0.m10746d(string4, "authId");
            this.f11623e = string4;
            boolean z10 = true;
            this.f11624f = parcel.readByte() != 0;
            this.f11625g = parcel.readString();
            String string5 = parcel.readString();
            C5056a0.m10746d(string5, "authType");
            this.f11626h = string5;
            this.f11627i = parcel.readString();
            this.f11628j = parcel.readString();
            this.f11629k = parcel.readByte() != 0;
            String string6 = parcel.readString();
            this.f11630l = string6 != null ? LoginTargetApp.valueOf(string6) : LoginTargetApp.FACEBOOK;
            this.f11613H = parcel.readByte() != 0;
            this.f11614I = parcel.readByte() == 0 ? false : z10;
            String string7 = parcel.readString();
            C5056a0.m10746d(string7, "nonce");
            this.f11615J = string7;
            this.f11616K = parcel.readString();
            this.f11617L = parcel.readString();
            String string8 = parcel.readString();
            this.f11618M = string8 == null ? null : CodeChallengeMethod.valueOf(string8);
        }

        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod) {
            C5207g.m11111f(loginBehavior, "loginBehavior");
            C5207g.m11111f(defaultAudience, "defaultAudience");
            C5207g.m11111f(str, "authType");
            this.f11619a = loginBehavior;
            this.f11620b = set == null ? new HashSet<>() : set;
            this.f11621c = defaultAudience;
            this.f11626h = str;
            this.f11622d = str2;
            this.f11623e = str3;
            this.f11630l = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str4 != null) {
                if (!(str4.length() == 0)) {
                    this.f11615J = str4;
                }
                this.f11616K = str5;
                this.f11617L = str6;
                this.f11618M = codeChallengeMethod;
            }
            String string = UUID.randomUUID().toString();
            C5207g.m11110e(string, "randomUUID().toString()");
            this.f11615J = string;
            this.f11616K = str5;
            this.f11617L = str6;
            this.f11618M = codeChallengeMethod;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6712a() {
            boolean z10;
            Iterator<String> it = this.f11620b.iterator();
            do {
                z10 = false;
                if (!it.hasNext()) {
                    return false;
                }
                String next = it.next();
                C7728m.b bVar = C7728m.f42275j;
                if (next != null && (C7661i.m15256V2(next, "publish", false) || C7661i.m15256V2(next, "manage", false) || C7728m.f42276k.contains(next))) {
                    z10 = true;
                }
            } while (!z10);
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "dest");
            parcel.writeString(this.f11619a.name());
            parcel.writeStringList(new ArrayList(this.f11620b));
            parcel.writeString(this.f11621c.name());
            parcel.writeString(this.f11622d);
            parcel.writeString(this.f11623e);
            parcel.writeByte(this.f11624f ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11625g);
            parcel.writeString(this.f11626h);
            parcel.writeString(this.f11627i);
            parcel.writeString(this.f11628j);
            parcel.writeByte(this.f11629k ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11630l.name());
            parcel.writeByte(this.f11613H ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11614I ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11615J);
            parcel.writeString(this.f11616K);
            parcel.writeString(this.f11617L);
            CodeChallengeMethod codeChallengeMethod = this.f11618M;
            parcel.writeString(codeChallengeMethod == null ? null : codeChallengeMethod.name());
        }
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "Code", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C2321a();

        /* JADX INFO: renamed from: a */
        public final Code f11631a;

        /* JADX INFO: renamed from: b */
        public final AccessToken f11632b;

        /* JADX INFO: renamed from: c */
        public final AuthenticationToken f11633c;

        /* JADX INFO: renamed from: d */
        public final String f11634d;

        /* JADX INFO: renamed from: e */
        public final String f11635e;

        /* JADX INFO: renamed from: f */
        public final Request f11636f;

        /* JADX INFO: renamed from: g */
        public Map<String, String> f11637g;

        /* JADX INFO: renamed from: h */
        public HashMap f11638h;

        @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m13365d2 = {"Lcom/facebook/login/LoginClient$Result$Code;", "", "loggingValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingValue", "()Ljava/lang/String;", "SUCCESS", "CANCEL", "ERROR", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
            public static Code[] valuesCustom() {
                Code[] codeArrValuesCustom = values();
                return (Code[]) Arrays.copyOf(codeArrValuesCustom, codeArrValuesCustom.length);
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Result$a */
        public static final class C2321a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "source");
                return new Result(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i10) {
                return new Result[i10];
            }
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            this.f11631a = Code.valueOf(string == null ? "error" : string);
            this.f11632b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f11633c = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.f11634d = parcel.readString();
            this.f11635e = parcel.readString();
            this.f11636f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f11637g = C5086z.m10811J(parcel);
            this.f11638h = C5086z.m10811J(parcel);
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            C5207g.m11111f(code, "code");
            this.f11636f = request;
            this.f11632b = accessToken;
            this.f11633c = authenticationToken;
            this.f11634d = str;
            this.f11631a = code;
            this.f11635e = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            C5207g.m11111f(code, "code");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "dest");
            parcel.writeString(this.f11631a.name());
            parcel.writeParcelable(this.f11632b, i10);
            parcel.writeParcelable(this.f11633c, i10);
            parcel.writeString(this.f11634d);
            parcel.writeString(this.f11635e);
            parcel.writeParcelable(this.f11636f, i10);
            C5086z c5086z = C5086z.f33015a;
            C5086z.m10815N(parcel, this.f11637g);
            C5086z.m10815N(parcel, this.f11638h);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$a */
    public interface InterfaceC2322a {
        /* JADX INFO: renamed from: a */
        void mo6713a();

        /* JADX INFO: renamed from: b */
        void mo6714b();
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$b */
    public static final class C2323b implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        public final LoginClient createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LoginClient[] newArray(int i10) {
            return new LoginClient[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$c */
    public interface InterfaceC2324c {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.facebook.login.LoginMethodHandler, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public LoginClient(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        ?? r10;
        C5207g.m11111f(parcel, "source");
        this.f11602b = -1;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i10 = 0;
        while (true) {
            linkedHashMap = null;
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i10];
            if (parcelable instanceof LoginMethodHandler) {
                r10 = linkedHashMap;
                r10 = (LoginMethodHandler) parcelable;
            }
            if (r10 != 0) {
                r10.f11642b = this;
            }
            if (r10 != 0) {
                arrayList.add(r10);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f11601a = (LoginMethodHandler[]) array;
        this.f11602b = parcel.readInt();
        this.f11607g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        HashMap mapM10811J = C5086z.m10811J(parcel);
        this.f11608h = mapM10811J == null ? null : C6753d.m13467T0(mapM10811J);
        HashMap mapM10811J2 = C5086z.m10811J(parcel);
        this.f11609i = mapM10811J2 != null ? C6753d.m13467T0(mapM10811J2) : linkedHashMap;
    }

    public LoginClient(Fragment fragment) {
        C5207g.m11111f(fragment, "fragment");
        this.f11602b = -1;
        if (this.f11603c != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.f11603c = fragment;
    }

    /* JADX INFO: renamed from: a */
    public final void m6702a(String str, String str2, boolean z10) {
        Map<String, String> map = this.f11608h;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f11608h == null) {
            this.f11608h = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6703b() {
        if (this.f11606f) {
            return true;
        }
        ActivityC0979t activityC0979tM6706e = m6706e();
        if ((activityC0979tM6706e == null ? -1 : activityC0979tM6706e.checkCallingOrSelfPermission("android.permission.INTERNET")) == 0) {
            this.f11606f = true;
            return true;
        }
        ActivityC0979t activityC0979tM6706e2 = m6706e();
        String string = null;
        String string2 = activityC0979tM6706e2 == null ? null : activityC0979tM6706e2.getString(R.string.com_facebook_internet_permission_error_title);
        if (activityC0979tM6706e2 != null) {
            string = activityC0979tM6706e2.getString(R.string.com_facebook_internet_permission_error_message);
        }
        Request request = this.f11607g;
        ArrayList arrayList = new ArrayList();
        if (string2 != null) {
            arrayList.add(string2);
        }
        if (string != null) {
            arrayList.add(string);
        }
        m6704c(new Result(request, Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m6704c(Result result) {
        C5207g.m11111f(result, "outcome");
        LoginMethodHandler loginMethodHandlerM6707h = m6707h();
        Result.Code code = result.f11631a;
        if (loginMethodHandlerM6707h != null) {
            m6709k(loginMethodHandlerM6707h.getF11647f(), code.getLoggingValue(), result.f11634d, result.f11635e, loginMethodHandlerM6707h.f11641a);
        }
        Map<String, String> map = this.f11608h;
        if (map != null) {
            result.f11637g = map;
        }
        LinkedHashMap linkedHashMap = this.f11609i;
        if (linkedHashMap != null) {
            result.f11638h = linkedHashMap;
        }
        this.f11601a = null;
        int i10 = -1;
        this.f11602b = -1;
        this.f11607g = null;
        this.f11608h = null;
        this.f11611k = 0;
        this.f11612l = 0;
        InterfaceC2324c interfaceC2324c = this.f11604d;
        if (interfaceC2324c == null) {
            return;
        }
        C2332c c2332c = (C2332c) ((C9371n) interfaceC2324c).f48145b;
        int i11 = C2332c.f11663A0;
        C5207g.m11111f(c2332c, "this$0");
        c2332c.f11665w0 = null;
        if (code == Result.Code.CANCEL) {
            i10 = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        ActivityC0979t activityC0979tM3582e = c2332c.m3582e();
        if (!c2332c.m3604y() || activityC0979tM3582e == null) {
            return;
        }
        activityC0979tM3582e.setResult(i10, intent);
        activityC0979tM3582e.finish();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:9:0x001f, B:11:0x002b, B:13:0x0061, B:12:0x0041), top: B:22:0x001f }] */
    /* JADX INFO: renamed from: d */
    public final void m6705d(Result result) {
        Result result2;
        C5207g.m11111f(result, "outcome");
        AccessToken accessToken = result.f11632b;
        if (accessToken != null) {
            Date date = AccessToken.f11370l;
            if (AccessToken.C2262b.m6596c()) {
                AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
                if (accessTokenM6595b != null) {
                    try {
                        if (C5207g.m11106a(accessTokenM6595b.f11379i, accessToken.f11379i)) {
                            result2 = new Result(this.f11607g, Result.Code.SUCCESS, result.f11632b, result.f11633c, null, null);
                        } else {
                            Request request = this.f11607g;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("User logged in as different Facebook user.");
                            result2 = new Result(request, Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null);
                        }
                    } catch (Exception e10) {
                        Request request2 = this.f11607g;
                        String message = e10.getMessage();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("Caught exception");
                        if (message != null) {
                            arrayList2.add(message);
                        }
                        m6704c(new Result(request2, Result.Code.ERROR, null, TextUtils.join(": ", arrayList2), null));
                        return;
                    }
                } else {
                    Request request3 = this.f11607g;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("User logged in as different Facebook user.");
                    result2 = new Result(request3, Result.Code.ERROR, null, TextUtils.join(": ", arrayList3), null);
                }
                m6704c(result2);
                return;
            }
        }
        m6704c(result);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final ActivityC0979t m6706e() {
        Fragment fragment = this.f11603c;
        if (fragment == null) {
            return null;
        }
        return fragment.m3582e();
    }

    /* JADX INFO: renamed from: h */
    public final LoginMethodHandler m6707h() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i10 = this.f11602b;
        if (i10 >= 0 && (loginMethodHandlerArr = this.f11601a) != null) {
            return loginMethodHandlerArr[i10];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX INFO: renamed from: j */
    public final C7725j m6708j() {
        Context contextM6706e;
        Request request;
        String strM15872b;
        String str;
        C7725j c7725j = this.f11610j;
        if (c7725j != null) {
            String str2 = null;
            if (C6205a.m12742b(c7725j)) {
                str = null;
            } else {
                try {
                    str = c7725j.f42269a;
                } catch (Throwable th2) {
                    C6205a.m12741a(c7725j, th2);
                    str = null;
                }
            }
            Request request2 = this.f11607g;
            if (request2 != null) {
                str2 = request2.f11622d;
            }
            if (!C5207g.m11106a(str, str2)) {
                contextM6706e = m6706e();
                if (contextM6706e == null) {
                    contextM6706e = C8004n.m15871a();
                }
                request = this.f11607g;
                if (request == null) {
                    strM15872b = C8004n.m15872b();
                } else {
                    strM15872b = request.f11622d;
                }
                c7725j = new C7725j(contextM6706e, strM15872b);
                this.f11610j = c7725j;
            }
        } else {
            contextM6706e = m6706e();
            if (contextM6706e == null) {
                contextM6706e = C8004n.m15871a();
            }
            request = this.f11607g;
            if (request == null) {
                strM15872b = C8004n.m15872b();
            } else {
                strM15872b = request.f11622d;
            }
            c7725j = new C7725j(contextM6706e, strM15872b);
            this.f11610j = c7725j;
        }
        return c7725j;
    }

    /* JADX INFO: renamed from: k */
    public final void m6709k(String str, String str2, String str3, String str4, HashMap map) {
        Request request = this.f11607g;
        if (request == null) {
            m6708j().m15310a("fb_mobile_login_method_complete", str);
            return;
        }
        C7725j c7725jM6708j = m6708j();
        String str5 = request.f11623e;
        String str6 = request.f11613H ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (C6205a.m12742b(c7725jM6708j)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = C7725j.f42268d;
            Bundle bundleM15311a = C7725j.a.m15311a(str5);
            if (str2 != null) {
                bundleM15311a.putString("2_result", str2);
            }
            if (str3 != null) {
                bundleM15311a.putString("5_error_message", str3);
            }
            if (str4 != null) {
                bundleM15311a.putString("4_error_code", str4);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = map.entrySet().iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((String) entry.getKey()) != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                bundleM15311a.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleM15311a.putString("3_method", str);
            c7725jM6708j.f42270b.m16340a(bundleM15311a, str6);
        } catch (Throwable th2) {
            C6205a.m12741a(c7725jM6708j, th2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6710l(int i10, int i11, Intent intent) {
        this.f11611k++;
        if (this.f11607g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f11427i, false)) {
                m6711n();
                return;
            }
            LoginMethodHandler loginMethodHandlerM6707h = m6707h();
            if (loginMethodHandlerM6707h != null && (!(loginMethodHandlerM6707h instanceof KatanaProxyLoginMethodHandler) || intent != null || this.f11611k >= this.f11612l)) {
                loginMethodHandlerM6707h.mo6683k(i10, i11, intent);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6711n() {
        LoginMethodHandler loginMethodHandlerM6707h = m6707h();
        if (loginMethodHandlerM6707h != null) {
            m6709k(loginMethodHandlerM6707h.getF11647f(), "skipped", null, null, loginMethodHandlerM6707h.f11641a);
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.f11601a;
        while (loginMethodHandlerArr != null) {
            int i10 = this.f11602b;
            boolean z10 = true;
            if (i10 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.f11602b = i10 + 1;
            LoginMethodHandler loginMethodHandlerM6707h2 = m6707h();
            boolean z11 = false;
            if (loginMethodHandlerM6707h2 != null) {
                if (!(loginMethodHandlerM6707h2 instanceof WebViewLoginMethodHandler) || m6703b()) {
                    Request request = this.f11607g;
                    if (request != null) {
                        int iMo6685q = loginMethodHandlerM6707h2.mo6685q(request);
                        this.f11611k = 0;
                        if (iMo6685q > 0) {
                            C7725j c7725jM6708j = m6708j();
                            String str = request.f11623e;
                            String strMo6681e = loginMethodHandlerM6707h2.getF11647f();
                            String str2 = request.f11613H ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!C6205a.m12742b(c7725jM6708j)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = C7725j.f42268d;
                                    Bundle bundleM15311a = C7725j.a.m15311a(str);
                                    bundleM15311a.putString("3_method", strMo6681e);
                                    c7725jM6708j.f42270b.m16340a(bundleM15311a, str2);
                                } catch (Throwable th2) {
                                    C6205a.m12741a(c7725jM6708j, th2);
                                }
                            }
                            this.f11612l = iMo6685q;
                        } else {
                            C7725j c7725jM6708j2 = m6708j();
                            String str3 = request.f11623e;
                            String strMo6681e2 = loginMethodHandlerM6707h2.getF11647f();
                            String str4 = request.f11613H ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!C6205a.m12742b(c7725jM6708j2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = C7725j.f42268d;
                                    Bundle bundleM15311a2 = C7725j.a.m15311a(str3);
                                    bundleM15311a2.putString("3_method", strMo6681e2);
                                    c7725jM6708j2.f42270b.m16340a(bundleM15311a2, str4);
                                } catch (Throwable th3) {
                                    C6205a.m12741a(c7725jM6708j2, th3);
                                }
                            }
                            m6702a("not_tried", loginMethodHandlerM6707h2.getF11647f(), true);
                        }
                        if (iMo6685q <= 0) {
                            z10 = false;
                        }
                        z11 = z10;
                    }
                } else {
                    m6702a("no_internet_permission", "1", false);
                }
            }
            if (z11) {
                return;
            }
        }
        Request request2 = this.f11607g;
        if (request2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            m6704c(new Result(request2, Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        parcel.writeParcelableArray(this.f11601a, i10);
        parcel.writeInt(this.f11602b);
        parcel.writeParcelable(this.f11607g, i10);
        C5086z c5086z = C5086z.f33015a;
        C5086z.m10815N(parcel, this.f11608h);
        C5086z.m10815N(parcel, this.f11609i);
    }
}
