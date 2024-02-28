import java.io.*;

class GFG
{
public static int Majority(int[] nums)
{
	int count = 0, maj = -1;
	for (int i = 0; i < nums.length; i++) {
	if (count == 0) {
		maj = nums[i];
		count = 1;
	}
	else {
		if (nums[i] == maj)
		count++;
		else
		count--;
	}
	}
	count = 0;
	for (int i = 0; i< nums.length; i++) {
	if (nums[i] == maj)
		count++;
	}
	if (count > (nums.length / 2))
	return maj;
	return -1;
}
public static void main(String[] args)
{
	int arr[] = { 1, 1, 1, 1, 2, 3, 4 };
	int majority = Majority(arr);
	System.out.println(" The majority element is : "
					+ majority);
}
}

