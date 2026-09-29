package p385sf;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.media.AbstractC0140a;
import android.view.View;
import androidx.compose.p017ui.text.C0692c;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.Extras;
import dm.C5207g;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jm.C6526i;
import kotlin.TypeCastException;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.C7076b;
import mo.C7661i;
import p003a2.C0009a;
import p231l1.C7208b;
import p260m8.C7499b;
import p338qd.C8584v;
import p387t0.AbstractC9161o;
import p387t0.C9152j0;
import p387t0.InterfaceC9165q;
import p399te.InterfaceC9279a;
import p402u0.C9376s;
import p445w1.C9798h;
import p470x1.C10022j;
import p479xa.C10134c0;
import p520z0.InterfaceC10426a;
import pl.InterfaceC8404a;
import pl.InterfaceC8405b;
import tl.C9319g;
import tl.C9322j;

/* JADX INFO: renamed from: sf.b */
/* JADX INFO: loaded from: classes.dex */
public class C9000b implements InterfaceC9279a, InterfaceC10426a {

    /* JADX INFO: renamed from: a */
    public static final int[][] f47196a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};

    /* JADX INFO: renamed from: b */
    public static final C9376s f47197b = new C9376s(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: c */
    public static final C9376s f47198c = new C9376s(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: d */
    public static final C9376s f47199d = new C9376s(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: e */
    public static final C9376s f47200e = new C9376s(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: f */
    public static final float[] f47201f = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: g */
    public static final byte[] f47202g = {0, 0, 0, 1};

    /* JADX INFO: renamed from: h */
    public static final String[] f47203h = {"", "A", "B", "C"};

    public C9000b() {
    }

    public C9000b(View view) {
        C5207g.m11111f(view, "view");
    }

    /* JADX INFO: renamed from: a */
    public static final long m17236a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m17237c(Object... objArr) {
        C5207g.m11111f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C9319g(objArr, true));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public static int m17238d(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        C5207g.m11111f(arrayList, "<this>");
        int size2 = arrayList.size();
        int i10 = 0;
        if (size < 0) {
            throw new IllegalArgumentException(C0009a.m20h("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(C0009a.m20h("toIndex (", size, ") is greater than size (", size2, ")."));
        }
        int i11 = size - 1;
        while (i10 <= i11) {
            int i12 = (i10 + i11) >>> 1;
            int iM14951m = C7499b.m14951m((Comparable) arrayList.get(i12), comparable);
            if (iM14951m < 0) {
                i10 = i12 + 1;
            } else {
                if (iM14951m <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final ListBuilder m17239e(ListBuilder listBuilder) {
        if (listBuilder.f38053e != null) {
            throw new IllegalStateException();
        }
        listBuilder.m13401y();
        listBuilder.f38052d = true;
        return listBuilder;
    }

    /* JADX INFO: renamed from: f */
    public static String m17240f(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX INFO: renamed from: g */
    public static String m17241g(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        Object[] objArr = new Object[5];
        objArr[0] = f47203h[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(z10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(C10134c0.m19045l("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static void m17242h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m17243i(C0692c c0692c, InterfaceC9165q interfaceC9165q, AbstractC9161o abstractC9161o, float f3, C9152j0 c9152j0, C9798h c9798h, AbstractC0140a abstractC0140a, int i10) {
        ArrayList arrayList = c0692c.f4563h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C7208b c7208b = (C7208b) arrayList.get(i11);
            c7208b.f40548a.mo2546c(interfaceC9165q, abstractC9161o, f3, c9152j0, c9798h, abstractC0140a, i10);
            interfaceC9165q.mo17427n(0.0f, c7208b.f40548a.mo2544a());
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m17244j(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public static Object m17245k(Class cls, Object obj) {
        if (obj instanceof InterfaceC8404a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC8405b) {
            return m17245k(cls, ((InterfaceC8405b) obj).mo469d());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC8404a.class, InterfaceC8405b.class));
    }

    /* JADX INFO: renamed from: l */
    public static final Error m17246l(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                if (C7661i.m15249O2(str, "request_with_file_path_already_exist") || C7076b.m14278X2(str, "UNIQUE constraint failed: requests._file (code 2067)", true)) {
                    return Error.REQUEST_WITH_FILE_PATH_ALREADY_EXIST;
                }
                if (C7076b.m14278X2(str, "UNIQUE constraint failed: requests._id", false)) {
                    return Error.REQUEST_WITH_ID_ALREADY_EXIST;
                }
                if (C7076b.m14278X2(str, "empty_response_body", true)) {
                    return Error.EMPTY_RESPONSE_FROM_SERVER;
                }
                if (!C7661i.m15249O2(str, "FNC") && !C7661i.m15249O2(str, "open failed: ENOENT (No such file or directory)")) {
                    if (!C7076b.m14278X2(str, "recvfrom failed: ETIMEDOUT (Connection timed out)", true) && !C7076b.m14278X2(str, "timeout", true) && !C7076b.m14278X2(str, "Software caused connection abort", true)) {
                        if (!C7076b.m14278X2(str, "Read timed out at", true)) {
                            if (!C7661i.m15249O2(str, "java.io.IOException: 404") && !C7076b.m14278X2(str, "No address associated with hostname", false)) {
                                if (C7076b.m14278X2(str, "Unable to resolve host", false)) {
                                    return Error.UNKNOWN_HOST;
                                }
                                if (C7661i.m15249O2(str, "open failed: EACCES (Permission denied)")) {
                                    return Error.WRITE_PERMISSION_DENIED;
                                }
                                if (!C7661i.m15249O2(str, "write failed: ENOSPC (No space left on device)") && !C7661i.m15249O2(str, "database or disk is full (code 13)")) {
                                    if (C7661i.m15249O2(str, "UNIQUE constraint failed: requests._id (code 1555)")) {
                                        return Error.REQUEST_ALREADY_EXIST;
                                    }
                                    if (C7661i.m15249O2(str, "fetch download not found")) {
                                        return Error.DOWNLOAD_NOT_FOUND;
                                    }
                                    if (C7661i.m15249O2(str, "Fetch data base error")) {
                                        return Error.FETCH_DATABASE_ERROR;
                                    }
                                    if (C7076b.m14278X2(str, "request_not_successful", true) || C7076b.m14278X2(str, "Failed to connect", true)) {
                                        return Error.REQUEST_NOT_SUCCESSFUL;
                                    }
                                    if (C7076b.m14278X2(str, "invalid content hash", true)) {
                                        return Error.INVALID_CONTENT_HASH;
                                    }
                                    if (C7076b.m14278X2(str, "download_incomplete", true)) {
                                        return Error.UNKNOWN_IO_ERROR;
                                    }
                                    if (C7076b.m14278X2(str, "failed_to_update_request", true)) {
                                        return Error.FAILED_TO_UPDATE_REQUEST;
                                    }
                                    if (C7076b.m14278X2(str, "failed_to_add_completed_download", true)) {
                                        return Error.FAILED_TO_ADD_COMPLETED_DOWNLOAD;
                                    }
                                    if (C7076b.m14278X2(str, "fetch_file_server_invalid_response_type", true)) {
                                        return Error.FETCH_FILE_SERVER_INVALID_RESPONSE;
                                    }
                                    if (C7076b.m14278X2(str, "request_does_not_exist", true)) {
                                        return Error.REQUEST_DOES_NOT_EXIST;
                                    }
                                    if (C7076b.m14278X2(str, "no_network_connection", true)) {
                                        return Error.NO_NETWORK_CONNECTION;
                                    }
                                    if (C7076b.m14278X2(str, "file_not_found", true)) {
                                        return Error.FILE_NOT_FOUND;
                                    }
                                    if (C7076b.m14278X2(str, "fetch_file_server_url_invalid", true)) {
                                        return Error.FETCH_FILE_SERVER_URL_INVALID;
                                    }
                                    if (C7076b.m14278X2(str, "request_list_not_distinct", true)) {
                                        return Error.ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
                                    }
                                    if (C7076b.m14278X2(str, "enqueue_not_successful", true)) {
                                        return Error.ENQUEUE_NOT_SUCCESSFUL;
                                    }
                                    if (C7076b.m14278X2(str, "cannot rename file associated with incomplete download", true)) {
                                        return Error.FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
                                    }
                                    if (C7076b.m14278X2(str, "file_cannot_be_renamed", true)) {
                                        return Error.FAILED_TO_RENAME_FILE;
                                    }
                                    if (C7076b.m14278X2(str, "file_allocation_error", true)) {
                                        return Error.FILE_ALLOCATION_FAILED;
                                    }
                                    return C7076b.m14278X2(str, "Cleartext HTTP traffic to", true) ? Error.HTTP_CONNECTION_NOT_ALLOWED : Error.UNKNOWN;
                                }
                                return Error.NO_STORAGE_SPACE;
                            }
                            return Error.HTTP_NOT_FOUND;
                        }
                    }
                    return Error.CONNECTION_TIMED_OUT;
                }
                return Error.FILE_NOT_CREATED;
            }
        }
        return Error.UNKNOWN;
    }

    /* JADX INFO: renamed from: m */
    public static final Error m17247m(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        boolean z10 = exc instanceof SocketTimeoutException;
        if (z10) {
            if (message.length() == 0) {
                message = "timeout";
            }
        }
        Error errorM17246l = m17246l(message);
        Error error = Error.UNKNOWN;
        if (errorM17246l == error && z10) {
            errorM17246l = Error.CONNECTION_TIMED_OUT;
        } else if (errorM17246l == error && (exc instanceof IOException)) {
            errorM17246l = Error.UNKNOWN_IO_ERROR;
        }
        errorM17246l.setThrowable(exc);
        return errorM17246l;
    }

    /* JADX INFO: renamed from: n */
    public static final C6526i m17248n(Collection collection) {
        C5207g.m11111f(collection, "<this>");
        return new C6526i(0, collection.size() - 1);
    }

    /* JADX INFO: renamed from: o */
    public static final int m17249o(List list) {
        C5207g.m11111f(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m17250p(Context context) {
        Boolean boolValueOf;
        C5207g.m11112g(context, "$this$isNetworkAvailable");
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (z11) {
            return z11;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        if (allNetworkInfo != null) {
            int length = allNetworkInfo.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                NetworkInfo networkInfo = allNetworkInfo[i10];
                C5207g.m11107b(networkInfo, "it");
                if (networkInfo.isConnected()) {
                    break;
                }
                i10++;
            }
            boolValueOf = Boolean.valueOf(z10);
        } else {
            boolValueOf = null;
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public static final List m17251q(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        C5207g.m11110e(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: r */
    public static final List m17252r(Object... objArr) {
        C5207g.m11111f(objArr, "elements");
        return objArr.length > 0 ? C9322j.m17670X(objArr) : EmptyList.f38032a;
    }

    /* JADX INFO: renamed from: s */
    public static final List m17253s(Object obj) {
        return obj != null ? m17251q(obj) : EmptyList.f38032a;
    }

    /* JADX INFO: renamed from: t */
    public static final ArrayList m17254t(Object... objArr) {
        C5207g.m11111f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C9319g(objArr, true));
    }

    /* JADX INFO: renamed from: u */
    public static final List m17255u(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : m17251q(list.get(0));
        }
        return EmptyList.f38032a;
    }

    /* JADX INFO: renamed from: v */
    public static final List m17256v(Iterable iterable) {
        C5207g.m11111f(iterable, "<this>");
        List listM13455w0 = C6752c.m13455w0(iterable);
        Collections.shuffle(listM13455w0);
        return listM13455w0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public static final void m17257w() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: x */
    public static final void m17258x(Download download, DownloadInfo downloadInfo) {
        C5207g.m11112g(download, "$this$toDownloadInfo");
        C5207g.m11112g(downloadInfo, "downloadInfo");
        downloadInfo.f32331a = download.getF32331a();
        downloadInfo.m10607l(download.mo10575H());
        downloadInfo.m10612x(download.mo10577L());
        downloadInfo.m10606k(download.mo10582V());
        downloadInfo.f32335e = download.getF32335e();
        downloadInfo.m10609q(download.mo10592v());
        downloadInfo.f32337g = C6753d.m13465R0(download.mo10587i());
        downloadInfo.f32338h = download.mo10574F();
        downloadInfo.f32339i = download.mo10591u();
        downloadInfo.m10610r(download.mo10588m());
        downloadInfo.m10608n(download.mo10580P());
        downloadInfo.m10604h(download.getF32341k());
        downloadInfo.f32321H = download.mo10584Z();
        downloadInfo.f32322I = download.mo10586g();
        downloadInfo.m10603e(download.getF32323J());
        downloadInfo.f32324K = download.getF32324K();
        downloadInfo.f32325L = download.getF32325L();
        Extras extrasMo10589o = download.mo10589o();
        C5207g.m11112g(extrasMo10589o, "<set-?>");
        downloadInfo.f32326M = extrasMo10589o;
        downloadInfo.f32327N = download.mo10581S();
        downloadInfo.f32328O = download.mo10578N();
    }

    /* JADX INFO: renamed from: y */
    public static final long m17259y(long j10) {
        return C8584v.m16788m((int) (j10 >> 32), C10022j.m18628b(j10));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    @Override // p399te.InterfaceC9279a
    /* JADX INFO: renamed from: b */
    public StackTraceElement[] mo11675b(StackTraceElement[] stackTraceElementArr) {
        int i10;
        boolean z10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num != null) {
                int iIntValue = num.intValue();
                int i14 = i12 - iIntValue;
                if (i12 + i14 <= stackTraceElementArr.length) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            z10 = true;
                            break;
                        }
                        if (!stackTraceElementArr[iIntValue + i15].equals(stackTraceElementArr[i12 + i15])) {
                            z10 = false;
                            break;
                        }
                        i15++;
                    }
                } else {
                    z10 = false;
                    break;
                }
                if (z10) {
                    int iIntValue2 = i12 - num.intValue();
                    if (i11 < 10) {
                        System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, iIntValue2);
                        i13 += iIntValue2;
                        i11++;
                    }
                    i10 = (iIntValue2 - 1) + i12;
                } else {
                    stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                    i13++;
                    i11 = 1;
                    i10 = i12;
                }
            } else {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = 1;
                i10 = i12;
            }
            map.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return i13 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }
}
